public class RedLightState implements TrafficLightState {
    @Override
    public TrafficLightState nextState() {
        return new YellowLightState();
    }

    @Override
    public void display() {
        System.out.println("RED light");
    }
}
