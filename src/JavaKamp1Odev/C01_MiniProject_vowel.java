package JavaKamp1Odev;

public class C01_MiniProject_vowel {
    public static void main(String[] args) {
        //write a code to check the given character is low vowel or high vowel(in Turkish, there is this kind of conditions exist.)
        char letter='ü';
        char[] vowels={'e','i','ö','ü','a','ı','o','u'};

        for(int i=0;i<8;i++){
            if(i<4 & letter==vowels[i]){
                System.out.println("Letter is low vowel");
            }else if(i>=4 & letter==vowels[i]){
                System.out.println("Letter is high vowel");
            }
        }
        //**********The other Approach**********
        switch (letter) {
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Letter is high vowel");
                break;
            default:
                System.out.println("Letter is low vowel");
        }
    }
}
