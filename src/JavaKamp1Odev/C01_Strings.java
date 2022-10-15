package JavaKamp1Odev;

public class C01_Strings {
    public static void main(String[] args) {

        String message = "The weather is very nice today.r";
        System.out.println(message);
        System.out.println("Number of elements: " + message.length());
        System.out.println("5th elements :" + message.charAt(4));
        System.out.println(message.concat(" yay!"));
        System.out.println(message.startsWith("T")); //returns boolean if it starts with "T"
        System.out.println(message.endsWith("y"));
        char[] characters = new char[12];
        message.getChars(0, 12, characters, 0);/*starting from message(0 index), ending point from message(4 index),
        where you want to store(characters char array), and where to begin to store in array(0 index) */
        //getChars does not include the source ending point(second parameter). thi sis why it should be 12
        System.out.println(characters);
        //System.out.println(characters[0]+"+"+characters[1]);
        System.out.println(message.indexOf("at"));//searches for first 'a'character or "at" string in the textand you could searc an string as well
        System.out.println(message.lastIndexOf("r"));//seraches for last char/string in the text
    }
}
