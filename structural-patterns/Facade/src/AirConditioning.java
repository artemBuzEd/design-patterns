public class AirConditioning implements SmartHouseStatusControler {
    private String status;
    private double neededTemperature;

    public AirConditioning() {
        status = "OFF";
        neededTemperature = 20;
    }

    public void turnOn(){
        status = "ON";
    }
    public void turnOff(){
        status = "OFF";
    }
    public void changeAirConditioningTemperature(double neededTemperature){
        this.neededTemperature = neededTemperature;
        status = "ON";
        System.out.println("Air conditioning temperature changed to: " + neededTemperature + "C");
    }
    @Override
    public String getStatus() {return status;}

    @Override
    public String toString(){
        return "\n\t-Air Conditioning status: " + status;
    }
}
