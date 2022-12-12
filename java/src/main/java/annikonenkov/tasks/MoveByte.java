package annikonenkov.tasks;

public class MoveByte {

    public static void main(String[] args) {

        System.out.println("----------------------");
        byte a1 = (byte) 0xFF; // -1
        System.out.println(Integer.toHexString(a1));
        System.out.println(Integer.toHexString((char) (a1)));
        System.out.println(Integer.toHexString((char) (a1 & 0xFF))); //Старшие биты пришлось увести в 0. Т.е. при касте отрицательно гочисла старшие биты тоже принимают значение 1 а не 0
        System.out.println(((char) a1) == ((char) 0xFFFF));

    }

}
