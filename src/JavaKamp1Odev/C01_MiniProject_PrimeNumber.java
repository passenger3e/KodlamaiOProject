package JavaKamp1Odev;

public class C01_MiniProject_PrimeNumber {
    public static void main(String[] args) {
        //write a code if the number is prime number
        //Firs Approach*******************************************************
        int number=409;
        int remainder=0;
        boolean remainderCatch=false;
        System.out.println("*********First Approach*********");

        for(int i=2;i<=number/2;i++){
            remainder=number%i;
            //System.out.println(number/2);
            if(remainder==0 & !remainderCatch){
                System.out.println("Given number is not a prime number and is at least divisible by: "+i);
                remainderCatch=true;

            }else if(remainder!=0 & i==number/2){
                System.out.println("Given number is a prime number");
            }

        }

        //Second Approach*******************************************************
        System.out.println("*********Second approach*********");
        boolean isPrime=true;
        for(int i=2;i<number;i++){

            if(number%i==0){
                isPrime=false;
            }

        }

        if(isPrime){
            System.out.println("number is a prime number");
        }

        //Best Approach*******************************************************
        isPrime=true;
        System.out.println("*********Best approach*********");
        for(int i =2;i<=Math.sqrt(number);i++) {
        if(number%i==0){
            isPrime=false;
        }
        }
        if(isPrime) {
            System.out.println("number is prime");
        }
    }
}
