package template_pattern;

public class CompanyLoan extends LoanTemplate {

    private boolean should = false;

    @Override
    protected boolean isShould() {
        return this.should;
    }

    @Override
    protected void checkIdentity() {
        System.out.println("check company Identity");
    }

    @Override
    protected void checkIncomeHistory() {
        System.out.println("check company Income history");
    }

    @Override
    protected void checkCreditHistory() {
        System.out.println("check company credit history");
    }
}
