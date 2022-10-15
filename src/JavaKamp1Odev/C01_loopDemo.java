package JavaKamp1Odev;

public class C01_loopDemo {
    public static void main(String[] args) {
        int i=0;

        for(i=1;i<=10;i++){
            System.out.print(i+"-");
        }
        System.out.println("Loop is finished");
        for(i=1;i<10;i+=2){
            System.out.println(i);
        }
    }
}
