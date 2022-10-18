package JavaKamp2Odev;

public class C02_VariableArguments {
    public static void main(String[] args) {
    int total=sum(1,3,5,81);
        System.out.println("Sum of the given numbers is: "+total);
    }
    public static int sum(int... numbers){
        int total=0;
        for(int number:numbers){
            total=total+number;
        }
        return total;
    }
}
