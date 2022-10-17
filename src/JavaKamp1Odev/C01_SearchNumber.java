package JavaKamp1Odev;

public class C01_SearchNumber {

    public static void main(String[] args) {
        int[] number = new int[]{1, 5, 11, 21, 44};
        int searchedNum = 21;
        boolean isFound = false;
        for (int i = 0; i < number.length; i++) {
            if (searchedNum == number[i]) {
                System.out.println("Searched number is exist in the stored array at " + i + ". index");
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Searched number couldn't be found");
        }
        //Other Approach*************************************
        isFound = true;
        for (int num : number) {
            if (num == searchedNum) {

                isFound = true;
                break;
            } else {
                isFound = false;
            }


        }
        if (isFound) {
            //printline the message
            System.out.println("Searched number is exist");
        } else {
            //printline the message
            System.out.println("Searched number is not exist");
        }
    }
}
