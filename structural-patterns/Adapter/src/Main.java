public class Main {
    public static void main(String[] args) {
        Pilot pilot = new Pilot();
        Plane plane = new Plane("An");
        pilot.flyOnTransport(plane);
        Parachute parachute = new Parachute();
        FlyableTransport parachuteAdapter = new ParachuteToPlaneAdapter(parachute);
        pilot.flyOnTransport(parachuteAdapter);
    }
}