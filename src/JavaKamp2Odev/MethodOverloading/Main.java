package JavaKamp2Odev.MethodOverloading;

public class Main {
    public static void main(String[] args) {
        //method overloading is creating same named methods with different combination of parameters or changing  parameters orders
        FourOperation operator=new FourOperation();


        System.out.println(operator.sum(2,5));
        System.out.println(operator.sum(2,5,3));
    }
}
