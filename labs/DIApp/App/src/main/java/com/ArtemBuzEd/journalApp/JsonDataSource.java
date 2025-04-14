package com.ArtemBuzEd.journalApp;

import Entities.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.File;
import java.io.IOException;

public class JsonDataSource {
    private final ObjectMapper objectMapper;
    private final String filePath;
    private User user;

    @Inject
    public JsonDataSource(@Named("FilePath") String path, ObjectMapper objectMapper) {
        this.filePath = path;
        this.objectMapper = objectMapper;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void saveUserDate(){
        try {
            objectMapper.writeValue(new File(filePath), user);
            System.out.println("Saved user date");
        } catch (IOException e){
            System.out.println("Error saving user data: " + e.getMessage());
        }
    }

    public User loadUserDate(){
        if(user == null){
            try {
                File file = new File(filePath);
                if(file.exists()){
                    user = objectMapper.readValue(file, User.class);
                }
            } catch (IOException e){
                System.out.println("Error loading user data: " + e.getMessage());
            }
        }
        return user;
    }

}
