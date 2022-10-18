package JavaKamp2Odev.InheritanceDemo;

public class Main {
    public static void main(String[] args) {
    FarmLoanManager farmLoanManager=new FarmLoanManager();
    StudentLoanManager studentLoanManager=new StudentLoanManager();
    farmLoanManager.Calculate();
    studentLoanManager.Calculate();
    LoanUI loanUI=new LoanUI();
    loanUI.LoanCalculate(new StudentLoanManager());//you can write what loan you want.this way you can add another class and can call it simply without changing codes
        //this is also called polymorphism
    }
}
