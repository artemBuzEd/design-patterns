import java.util.ArrayList;
import java.util.List;

public class SmartHomeFacade {
    private Lights lights;
    private SecuritySystem securitySystem;
    private AirConditioning airConditioning;

    public SmartHomeFacade() {
        lights = new Lights();
        securitySystem = new SecuritySystem();
        airConditioning = new AirConditioning();
    }
    public void goIn(){
        System.out.println("======Welcome to SmartHome======");
        securitySystem.turnOff();
        System.out.println(securitySystem);
        lights.turnOn();
        System.out.println(lights);
        airConditioning.turnOn();
        System.out.println(airConditioning);
    }
    public void goOut(){
        System.out.println("======Bye SmartHome======");
        lights.turnOff();
        System.out.println(lights);
        airConditioning.turnOff();
        System.out.println(airConditioning);
        securitySystem.turnOn();
        System.out.println(securitySystem);
    }
    public void nightMode(){
        System.out.println("======SmartHome Night Mode======");
        lights.turnOff();
        System.out.println(lights);
        airConditioning.changeAirConditioningTemperature(18);
        System.out.println(airConditioning);
        securitySystem.turnOn();
        System.out.println(securitySystem);
    }
    @Override
    public String toString() {
        return "Home systems status: ";
    }
}
