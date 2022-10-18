package JavaKamp2Odev.RecapDemo_Classes;

public class FourOperations {
    public int sum(int... numbers) {
        int total=0;
        for(int _sum:numbers){
            total=total+_sum;
        }
        return total;
    }

    public int subtraction(int... numbers) {
        //to subtract all the given numbers we can assume this: number1-(sum of other numbers)
        int total=numbers[0];//First minuend number is stored
        int total1=0;// initialized as 0 to sum all subtrahend numbers
        for(int _sum:numbers){
            total1=total1-_sum;//All numbers are summed. be carefull! first minuend value added too, soo it will be subtracted again at last.
        }
        total=2*total+total1;//So,first number+[-(first number+other numbers)]. we have to mulply the first number(total) with 2.
        return total;
    }

    public double multiplication(double... numbers) {
        double total=1;
        for(double _sum:numbers){
            total=total*_sum;
        }
        return total;
    }
    public double division(int number1, double number2) { //enough to set one of the parameter as double to make division properly

        return number1/number2;
    }
}
