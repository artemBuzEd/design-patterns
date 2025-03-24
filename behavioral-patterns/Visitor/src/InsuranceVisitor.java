public interface InsuranceVisitor {
    void visit(CarInsurance carInsurance);
    void visit(HomeInsurance homeInsurance);
    void visit(HealthInsurance healthInsurance);
}
