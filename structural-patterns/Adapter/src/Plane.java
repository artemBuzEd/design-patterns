public class Plane implements FlyableTransport{
    private String planeName;

    public Plane(String planeName) {
        this.planeName = planeName;
    }

    public void fly() {
        System.out.println("You are flying on " + planeName);
    }
    public String getPlaneName() {return planeName;}
}
