public class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        this.state = new RedLightState();
    }

    public void display() {
        state.display();
    }

    public void changeLight() {
        state = state.nextState();
    }
}
