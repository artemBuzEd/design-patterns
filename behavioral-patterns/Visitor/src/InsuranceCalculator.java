public class InsuranceCalculator implements InsuranceVisitor {
    @Override
    public void visit(CarInsurance carInsurance) {
        double result = carInsurance.getCarValue() / 20;
        System.out.println("Car Insurance " + result);
    }

    @Override
    public void visit(HomeInsurance homeInsurance) {
        double result = homeInsurance.getHomeValue() / 10;
        System.out.println("Home Insurance " + result);
    }

    @Override
    public void visit(HealthInsurance healthInsurance) {
        double result = healthInsurance.getAge() * 10;
        System.out.println("Health Insurance " + result);
    }
}
