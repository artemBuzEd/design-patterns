public class YellowLightState implements TrafficLightState {
    @Override
    public TrafficLightState nextState() {
        return new GreenLightState();
    }

    @Override
    public void display() {
        System.out.println("YELLOW light");
    }
}
