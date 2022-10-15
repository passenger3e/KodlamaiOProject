package JavaKamp1Odev;

public class C01_whileloop {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            System.out.println(i);
        }//declaration of i in the for loop only concerns the for loop, if you will use i in another place yuo should declare the i again like below
        System.out.println("for loop is finished");
        int i=0;
        while(i<10){
            System.out.println(i);
            i++;
        }
    }
}
