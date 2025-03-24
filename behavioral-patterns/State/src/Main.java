public class Main {
    public static void main(String[] args) {

        TrafficLight tl = new TrafficLight();

        for(int i = 0; i < 6; i++){
            tl.display();
            tl.changeLight();
        }
    }
}