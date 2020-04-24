package template_pattern;

public abstract class LoanTemplate {

    protected boolean isShould() {
        return true;
    }

    protected abstract void checkIdentity();

    protected abstract void checkIncomeHistory();

    protected abstract void checkCreditHistory();

    public final void checkLoanApplication() {
        checkIdentity();
        if (isShould()) {
            checkIncomeHistory();
        }
        checkCreditHistory();
    }
}
