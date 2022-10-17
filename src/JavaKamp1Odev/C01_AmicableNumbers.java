package JavaKamp1Odev;

public class C01_AmicableNumbers {
    public static void main(String[] args) {
        int number1 = 66928;//220, 6232
        int number2 = 66992;//284, 6368
        if (properDivisor(number1) == number2 & properDivisor(number2) == number1) {
            System.out.println(number1 + " and " + number2 + " are Amicable numbers");
        } else {
            System.out.println(number1 + " and " + number2 + " are not Amicable numbers");
        }

        /*Thabit ibn Qurra theorem
        *****Mathematical Expression*****
        let say: (2^n)*p*q and (2^n)*r are two pair of numbers if n>1 and Integer and also p,q and r are prime then that number are Amicable numbers
        */

        int countTwo_1;
        int[] PandQ;
      /* Instead of this code block, Math method used
       if(countTwos(number1)<countTwos(number2)) {
        countTwo_1=countTwos(number1);
       }else{
           countTwo_1=countTwos(number2);
       }
       */
        countTwo_1 = Math.min(countTwos(number1), countTwos(number2));
       if(countTwo_1>1){
           //System.out.println(countTwo_1);
           if(isPrime((int) ( number1/Math.pow(2,countTwo_1)))){

               System.out.println("required r value is found as: "+number1/Math.pow(2,countTwo_1));
               PandQ=findotherPrime(countTwo_1);
               System.out.println("P value is "+ PandQ[0]);
               System.out.println("Ğ value is "+ PandQ[1]);
           }
           else{

               System.out.println("required r value is found as: "+number2/Math.pow(2,countTwo_1));
               PandQ=findotherPrime(countTwo_1);
               System.out.println("P value is "+ PandQ[0]);
               System.out.println("Q value is "+ PandQ[1]);
           }



       }else{
           System.out.println("two numbers are doesn't provide enough n value.it should be n>1");
       }
    }
    public static int[] findotherPrime(int powerofTwo){
        int[] primePandQ=new int[2];
        primePandQ[0]=(int)(3*(Math.pow(2,powerofTwo-1))-1);
       // System.out.println((Math.pow(2,powerofTwo-1))+" "+powerofTwo);
        primePandQ[1]=(int)(3*(Math.pow(2,powerofTwo))-1);
        return primePandQ;
    }
    public static int countTwos(double _value){
        double temp=_value;
        int countTwo=0;
        boolean condition=true;
        while(condition) {
            if (temp%2==0){
                countTwo++;
                temp=temp/2;

            }else{
                condition=false;
            }
        }
        return countTwo;
    }
    public static boolean isPrime(int PrimeorNot){
        boolean checkPrime=true;
        for(int i=1;i<Math.sqrt(PrimeorNot);i++){
            if(PrimeorNot%i==0) {
                checkPrime = true;
            }else{
                checkPrime=false;
            }
        }
        return checkPrime;
    }

    public static int properDivisor(int _number) {
        int total = 0;

        for (int i = 1; i < _number; i++) {
            if (_number % i == 0) {
                total = total + i;
            }
        }
        return total;
    }
}
