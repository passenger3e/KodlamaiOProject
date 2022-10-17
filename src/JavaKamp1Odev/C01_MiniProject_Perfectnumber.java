package JavaKamp1Odev;

public class C01_MiniProject_Perfectnumber {
    public static void main(String[] args) {
        //Write a code to check the number is perfect number or not
        //**********First approach(Basic, without mathematical expression)*******
        int number=2016;//496 is perfect number and 2016=you can get first and second multiplier but second part is not provide the prime condition
        //If you don't know the mathematical expression
        int total=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                total=total+i;
            }
        }
        if(total==number) {
            System.out.println(number+" is a perfect number.");
        }else{
            System.out.println(number+" is not a perfect number.");
        }

        //Based on Mathematical expression
        /*
        Assume number=2^P*[2^(p-1)-1] and if second multiplier-[2^(p-1)-1]- is prime number, given number will be perfect number.
         */

        int countTwo=0;
        int remainder=0;
        int temp=number;
        boolean condition=true;
        //first check and find the two's to find the first multiplier
        while(condition){
           // remainder=temp%2;
            if(temp%2==0){
                temp=temp/2;
                countTwo++;
            }else{
                condition=false;
            }
        }
        //System.out.println(countTwo);
        if(isPrimeNumber(number/(Math.pow(2,countTwo)))){// sending the second multiplier to check the prime condition
            System.out.println(number+" is a perfect number!!");
        }else{
            System.out.println(number+" in not a perfect number");
        }
    }

    //Prime value checking method
    public static boolean isPrimeNumber(double _number){
        //Checking the second multiplier is prime or not
        boolean isPrime=true;
        double value=_number;
        System.out.println("*********Best approach*********");
        for(int i =2;i<=Math.sqrt(value);i++) {
            if(value%i==0){
                isPrime=false;
            }
        }
        if(isPrime & value>=2) {
            System.out.println("multiplier is prime");
            isPrime=true;
        }else{
            System.out.println("multiplier is not prime");
            isPrime=false;
        }
        return isPrime;
    }
}
