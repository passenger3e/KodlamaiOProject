package JavaKamp1Odev;

public class C01_MiniProject_PrimeNumber {
    public static void main(String[] args) {
        //write a code to check the number is prime number
        //Firs Approach*******************************************************
        int number=1;
        int remainder=0;
        boolean remainderCatch=false;
        System.out.println("*********First Approach*********");
        if(number==2||number==3){
            System.out.println("Number is prime");
        }else if(number==1){
            System.out.println("1 is not prime");
        }
        for(int i=2;i<=number/2;i++){ /* in this first approach, for the number 1,2 and 3 loop won't work
        so these number should be checked additionally before this loop*/
            remainder=number%i;
            if((remainder==0 & !remainderCatch)){
                    System.out.println("Number is not  prime  and is at least divisible by: " + i);

                remainderCatch=true;

            }else if(remainder!=0 & i==number/2){
                System.out.println("Number is prime");
            }else{
                System.out.println("Number is not prime");
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

        if(isPrime & number>=2){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }

        //Best Approach*******************************************************
        isPrime=true;
        System.out.println("*********Best approach*********");
        for(int i =2;i<=Math.sqrt(number);i++) {
        if(number%i==0){
            isPrime=false;
        }
        }
        if(isPrime & number>=2) {
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
    }
}
