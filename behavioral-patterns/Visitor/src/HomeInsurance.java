public class HomeInsurance implements InsurancePolicy {
    public int homeValue;

    public HomeInsurance(int homeValue) {
        this.homeValue = homeValue;
    }

    public int getHomeValue() { return homeValue; }

    @Override
    public void accept(InsuranceVisitor visitor) {
        visitor.visit(this);
    }
}
