package JavaKamp1Odev;

public class C01_Arrays {
    public static void main(String[] args) {
        String student1="Ali";
        String student2="Burak";
        System.out.println(student1+"-"+student2);
        System.out.println("----------------------");
        String[] students=new String[3];
        students[0]="Batuhan";
        students[1]="Hüseyin";
        students[2]="Nihal";
        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }
        System.out.println("refactoring the code...");
        for(String student:students){//searches for all students in students array without index > refactoring (kod iyilestirme duzenleme)
            System.out.println(student);
        }
    }
}
