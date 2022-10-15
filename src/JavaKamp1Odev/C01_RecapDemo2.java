package JavaKamp1Odev;

public class C01_RecapDemo2 {
    public static void main(String[] args) {
        double[] _list = {1.2, 2.5, 3.5, 5.6};
        double[] myList = new double[3];
        myList[0]=8.44;
        double total = 0;
        double max = _list[0];
        for (double list : _list) {
            if (max < list) {
                max = list;
            }
            total = total + list;
            System.out.println(list);
        }
        System.out.println("Total = " + total);
        System.out.println("Biggest number = " + max);
        System.out.println(myList[0]);
    }
}
