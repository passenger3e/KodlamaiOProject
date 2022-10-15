package JavaKamp1Odev;

public class C01_recapDemo1 {
    public static void main(String[] args) {
        int number;
        number=20;
        int number2=25;
        int number3=2;
        int biggestNumber=number;
        if(biggestNumber<number2){
            biggestNumber=number2;
        }
        if(biggestNumber<number3){
            biggestNumber=number3;
        }
        System.out.println("Biggest numner is: " +biggestNumber);
    }
}
