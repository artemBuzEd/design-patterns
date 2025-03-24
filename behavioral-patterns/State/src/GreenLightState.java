public class GreenLightState implements TrafficLightState {
    @Override
    public TrafficLightState nextState() {
        return new RedLightState();
    }

    @Override
    public void display() {
        System.out.println("GREEN light");
    }
}
