public class SecuritySystem implements SmartHouseStatusControler{
    private String status;

    public SecuritySystem(){
        status = "OFF";
    }

    public void turnOff(){
        status = "OFF";
        System.out.println("Security system DEACTIVATED");
    }
    public void turnOn(){
        status = "ON";
        System.out.println("Security system ACTIVATED");
    }

    @Override
    public String getStatus() {return status;}

    @Override
    public String toString() {
        return "\n\t-Security system status: " + status;
    }
}
