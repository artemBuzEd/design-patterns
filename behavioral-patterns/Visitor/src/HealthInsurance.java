public class HealthInsurance implements InsurancePolicy{
    private int age;

    public HealthInsurance(int age) {
        this.age = age;
    }

    public int getAge() { return age; }

    @Override
    public void accept(InsuranceVisitor visitor) {
        visitor.visit(this);
    }
}
