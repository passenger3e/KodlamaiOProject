package JavaKamp1Odev;

public class C01_multidimArray {
    public static void main(String[] args) {
        String[][] cities=new String[3][3];
        cities[0][0]="Adana";
        cities[0][1]="Hatay";
        cities[0][2]="Osmaniye";
        cities[1][0]="Batman";
        cities[1][1]="Diyarbakir";
        cities[1][2]="Adiyaman";
        cities[2][0]="Istanbul";
        cities[2][1]="Bursa";
        cities[2][2]="Bilecik";
        for(int i=0;i<3;i++){
            System.out.println("------------Regions---------");
            for(int j=0;j<=2;j++){
                System.out.println(cities[i][j]);
            }
        }
    }
}
