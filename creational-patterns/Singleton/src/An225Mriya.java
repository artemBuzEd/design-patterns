public class An225Mriya {
    private static An225Mriya plane = null;
    private int fuel;

    private An225Mriya(){

    }

    public static An225Mriya getPlaneInstance(int fuel){
        if(plane == null){
            plane = new An225Mriya();
            plane.fuel = fuel;
        }
        return plane;
    }

    public void newRoute(String cityA, String cityB){
        System.out.println("An-225 travelled from " + cityA + " to " + cityB);
    }

    public int GetFuel(){
        return this.fuel;
    }
}
