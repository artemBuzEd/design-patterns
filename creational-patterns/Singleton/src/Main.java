
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        An225Mriya plane1 = An225Mriya.getPlaneInstance(1000);
        System.out.println("First plane fuel " + plane1.GetFuel());

        An225Mriya plane2 = An225Mriya.getPlaneInstance(2000);
        System.out.println("Second plane fuel " + plane2.GetFuel());

        if(plane1 == plane2){
            System.out.println("plane1 and plane2 is the same objects");
        }
    }
}