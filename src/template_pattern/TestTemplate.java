package template_pattern;

public class TestTemplate {
    public static void main(String[] args) {
        LoanTemplate lt = new PersonLoan();
        lt.checkLoanApplication();
        LoanTemplate lt2 = new CompanyLoan();
        lt2.checkLoanApplication();
    }
}
