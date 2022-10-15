package JavaKamp1Odev;

public class C01_SwitchDemo {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent! You passed");
                break;
            case 'B':
                System.out.println("Good! You passed");
                break;
            case 'C':
                System.out.println("Not Bad, You passed");
                break;
            case 'F':
                System.out.println("Sorry, You Failled");
            default:
                System.out.println("Invalid Entry");
                // ctrl + shift + alt + L > to reformat the codes
        }
    }
}
