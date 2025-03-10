public class ParachuteToPlaneAdapter implements FlyableTransport{
    Parachute parachute;

    public ParachuteToPlaneAdapter(Parachute parachute){
        this.parachute = parachute;
    }

    public void fly(){
        parachute.fall();
    }
}
