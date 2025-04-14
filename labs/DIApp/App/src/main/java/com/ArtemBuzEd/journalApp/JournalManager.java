package com.ArtemBuzEd.journalApp;

import Comparators.DateComparator;
import Comparators.TitleComparator;
import Entities.JournalEntry;
import Entities.Tag;
import Entities.User;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.inject.Inject;

public class JournalManager {
    private final JsonDataSource jds;

    @Inject
    public JournalManager(JsonDataSource jds) {
        this.jds = jds;
    }

    public boolean userExists() {
        return jds.loadUserDate() != null;
    }

    public boolean isJournalListEmpty() {
        if(jds.loadUserDate().getJournalList().isEmpty()){
            System.out.println("No journals found");
            return true;
        }
        return false;
    }

    public void displayUserJournals() {
        if(isJournalListEmpty())
            return;

        for(JournalEntry je : jds.loadUserDate().getJournalList()){
            displayJournalEntry(je);
        }
    }
    public void displayJournalEntry(JournalEntry entry) {
        System.out.println("\n===" + entry.getTitle() + "===");
        System.out.println("Date: " + entry.getWroteDate());
        System.out.println("Time: " + entry.getWroteTime().getHour() + ":" + entry.getWroteTime().getMinute());

        System.out.println("\nTags: ");
        if(entry.getTags().isEmpty()) {
            System.out.println("None");
        } else {
            for(Tag tag : entry.getTags()) {
                System.out.println("- " + tag);
            }
        }

        System.out.println("\nContent: ");
        System.out.println(entry.getContent());
        System.out.println("\n==================================");

    }

    public void addJournal(JournalEntry entry) {
        jds.loadUserDate().addJournalEntry(entry);
        System.out.println("Journal added successfully!");
    }
    public void updateJournal(JournalEntry entry, String newTitle, String newContent, String updateTags) {

        if(!newTitle.isEmpty()){
            entry.setTitle(newTitle);
        }

        if(!newContent.isEmpty()){
            entry.setContent(newContent);
        }

        if(!updateTags.equals("y")){
            entry.getTags().clear();
        }

        System.out.println("Journal updated successfully!");
    }

    public void deleteJournal(int choice){
        try {
            if (choice > 0 && choice <= jds.loadUserDate().getJournalList().size()) {
                jds.loadUserDate().getJournalList().remove(choice - 1);
                System.out.println("Journal was deleted successfully!");
            } else if(choice != 0){
                System.out.println("Invalid option. Try again.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + " [deleteJournal func]");
        }
    }

    public void displayJournalSearchResult(List<JournalEntry> journalList){
        if(journalList.isEmpty()){
            System.out.println("No matching journals was found.");
            return;
        }

        System.out.println("\n===== Journals =====");
        for(int i = 0; i < journalList.size(); i++){
            JournalEntry je = journalList.get(i);
            System.out.println((i) + ". Journal Title: " + je.getTitle() + " (" + je.getWroteDate() + ")");
        }

        System.out.println("\nEnter Journal title number: (or 0 to quit)");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine().trim());

        if(choice > 0 && choice <= journalList.size()){
            displayJournalEntry(journalList.get(choice - 1));
        }
    }
    public void searchJournal(String searchChoice, String searchTerm){
        List<JournalEntry> journalListOfFounded = new ArrayList<>();

        switch (searchChoice) {
            case "1":
                System.out.println("Enter Journal Title: ");
                for(JournalEntry je : jds.loadUserDate().getJournalList()){
                    if(je.getTitle().toLowerCase().contains(searchTerm.toLowerCase())){
                        journalListOfFounded.add(je);
                    }
                }
                break;
                case "2":
                    System.out.println("Enter Journal Content: ");
                    for(JournalEntry je : jds.loadUserDate().getJournalList()){
                        if(je.getContent().toLowerCase().contains(searchTerm.toLowerCase())){
                            journalListOfFounded.add(je);
                        }
                    }
                    break;
            case "3":
                System.out.println("Enter Journal Entities.Tag: ");
                for(JournalEntry je : jds.loadUserDate().getJournalList()){
                    for(Tag tag : je.getTags()){
                        if(tag.getName().toLowerCase().contains(searchTerm.toLowerCase())){
                            journalListOfFounded.add(je);
                            break;
                        }
                    }
                }
                break;
            case "4":
                try {
                    LocalDate searchDate = LocalDate.parse(searchTerm);
                    for(JournalEntry je : jds.loadUserDate().getJournalList()){
                        if(je.getWroteDate().equals(searchDate)){
                            journalListOfFounded.add(je);
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage() + " [searchJournalFunc]");
                }
                break;
                default:
                    System.out.println("Invalid choice");
                    break;
        }
        displayJournalSearchResult(journalListOfFounded);
    }

    public List<JournalEntry> sortedJournals(String sortChoice){

        List<JournalEntry> sortedList = new ArrayList<>(jds.loadUserDate().getJournalList());
        switch (sortChoice) {
            case "1":
                sortedList.sort(new TitleComparator());
                break;
            case "2":
                sortedList.sort(new TitleComparator().reversed());
                break;
            case "3":
                sortedList.sort(new DateComparator());
                break;
            case "4":
                sortedList.sort(new DateComparator().reversed());
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("\n===== Sort Journals =====");
        int i = 1;
        for(JournalEntry je : sortedList){
            System.out.println((i) + ". " + je.getTitle() + " (" + je.getWroteDate() + ")");
            i++;
        }

        return sortedList;
    }

    public void createUser(User user) {
        jds.setUser(user);
    }

    public User loadUserDate(){
        return jds.loadUserDate();
    }

    public void saveUserDate(){
        jds.saveUserDate();
    }
}
