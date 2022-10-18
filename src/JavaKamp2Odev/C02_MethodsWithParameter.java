package JavaKamp2Odev;

public class C02_MethodsWithParameter {
    public static void main(String[] args) {
        int firstValue=81;
        int secondValue=44;
        int total = sum(firstValue,secondValue);
        result(total);
        message();
        String cityName=getACityName(1);
        System.out.println("Called city name is: "+cityName);
    }

    public static void message() {
        System.out.println("Method is called");
    }
    public static void result(int total){
        System.out.println("Total value is: "+ total);

    }

    public static int sum(int i, int j) {
        return i+j;
        //return 5 + 10;
    }

    public static String getACityName(int i) {
        String[] cities={"Istanbul","ADANA"};
        return cities[i];
       // return "ADANA";
    }
}
