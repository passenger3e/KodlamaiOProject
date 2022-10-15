package JavaKamp1Odev;

public class C01_Strings2 {
    public static void main(String[] args) {
        String message="The weather is nice today";
        System.out.println(message);
        String newMessage=message.replace(' ','-');//replace the fisrt declared character(whic is space character) with second declared character(-)
        System.out.println(newMessage);
        //substring
        System.out.println(message.substring(2));// cuts the string from declared index(2nd)
        System.out.println(message.substring(2,6));//cuts the string from first index(2) up to second index(6)
        //split
        for(String words:message.split(" ")){
            System.out.println(words);
        }
        System.out.println(message.toUpperCase());
        message=" The weather is nice today ";//added spaces to beginning and ending of the message
        System.out.println(message);
        System.out.println(message.trim());// trimed out the spaeces beginning and ending of the message
    }
}
