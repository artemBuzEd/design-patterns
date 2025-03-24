public class CarInsurance implements InsurancePolicy {
    private int carValue;

    public CarInsurance(int carValue) {
        this.carValue = carValue;
    }

    public int getCarValue() {
        return carValue;
    }

    @Override
    public void accept(InsuranceVisitor visitor) {
        visitor.visit(this);
    }
}
