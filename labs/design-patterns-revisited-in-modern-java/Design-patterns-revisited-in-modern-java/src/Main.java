import decorator.Formatters;
import decorator.TextProcessor;
import executeAround.DBConnection;
import factoryMethod.Car;
import factoryMethod.Motor;
import factoryMethod.cars.Audi;
import factoryMethod.cars.BMW;
import factoryMethod.cars.Mercedes;
import strategy.Package;
import strategy.ShippingCalculator;

public class Main {
    public static void printFormatedText(TextProcessor textProcessor) {
        System.out.println(textProcessor.process("This is a test text for checking"));
    }
    public static void main(String[] args) {
        System.out.println("===========Strategy Pattern===========");
        Package pk1 = new Package(1.5, 150);
        Package pk2 = new Package(2.5, 200);
        Package pk3 = new Package(1, 50);
        Package pk4 = new Package(0.5, 20);

        ShippingCalculator calculator = new ShippingCalculator();

        System.out.println("Package 1 "+calculator.calculateShipping(pk1,ShippingCalculator::byPlaneExpress));
        System.out.println("Package 2 "+calculator.calculateShipping(pk2,ShippingCalculator::byShipExpress));
        System.out.println("Package 3 "+calculator.calculateShipping(pk3,ShippingCalculator::byPlaneStandard));
        System.out.println("Package 1 "+calculator.calculateShipping(pk1,ShippingCalculator::byShipStandard));


        System.out.println("===========Factory Method===========");

        Motor bmwMotor = new Motor(550);
        Motor mercedesMotor = new Motor(570);
        Motor audiMotor = new Motor(600);

        BMW bmw = new BMW(bmwMotor, 1928);
        Mercedes mercedes = new Mercedes(mercedesMotor, 2112);
        Audi audi = new Audi(audiMotor, 2090);

        bmw.print();
        mercedes.print();
        audi.print();

        System.out.println("===========Decorator Pattern===========");

        printFormatedText(new TextProcessor(Formatters.toUpper(), Formatters.addPrefix("Start "), Formatters.addSuffix(" End"), Formatters.addQuotes()));

        DBConnection.use("/mongodb:27017/userdb", db -> db.checkConnection().connect());
    }
}