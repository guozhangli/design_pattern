package template_pattern;

public class PersonLoan extends LoanTemplate {
    @Override
    protected void checkIdentity() {
        System.out.println("check person Identity");
    }

    @Override
    protected void checkIncomeHistory() {
        System.out.println("check person Income history");
    }

    @Override
    protected void checkCreditHistory() {
        System.out.println("check person Credit history");
    }
}
