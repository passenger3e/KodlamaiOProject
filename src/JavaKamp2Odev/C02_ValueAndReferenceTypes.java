package JavaKamp2Odev;

public class C02_ValueAndReferenceTypes {
    public static void main(String[] args) {
        int number1=10;
        int number2=20;

        //value type
        number1=number2;
        number2=30;
        System.out.println(number1);//because of being value type,number1 won't be change when number2 is changed

        //reference type
        int[] numbers1=new int[]{1,2,3};
        int[] numbers2=new int[]{4,5,6};
        numbers1=numbers2;
        numbers2[0]=20;
        System.out.println(numbers1[0]);//because of being reference type, numbers1 will change when numbers2 changed with calling referenced declaration
    }
}
