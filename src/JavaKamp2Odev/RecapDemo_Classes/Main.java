package JavaKamp2Odev.RecapDemo_Classes;

public class Main {
    public static void main(String[] args) {
    FourOperations operator=new FourOperations();

        System.out.println(operator.subtraction(10,-5,3,1));
        System.out.println(operator.division(25,3));
        System.out.println(operator.multiplication(12,3,8));
        System.out.println(operator.sum(102,81,72));
    }
}
