public class Main {
    public static void main(String[] args) {
        InsurancePolicy carIn = new CarInsurance(10000);
        InsurancePolicy homeIn = new HomeInsurance(50000);
        InsurancePolicy healthIn = new HealthInsurance(30);

        InsuranceVisitor insuranceVisitor = new InsuranceCalculator();

        carIn.accept(insuranceVisitor);
        homeIn.accept(insuranceVisitor);
        healthIn.accept(insuranceVisitor);
    }
}