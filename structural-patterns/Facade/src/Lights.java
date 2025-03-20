public class Lights implements SmartHouseStatusControler {
    private String status;

    public Lights() {
        status = "OFF";
    }
    public void turnOn(){
        status = "ON";
        System.out.println("Lights was turned " + status);
    }

    public void turnOff(){
        status = "OFF";
        System.out.println("Lights was turned " + status);
    }

    @Override
    public String getStatus(){return status;}

    @Override
    public String toString(){
        return "\n\t-Lights status: " + status;
    }
}
