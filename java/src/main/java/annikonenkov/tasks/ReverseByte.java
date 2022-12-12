package annikonenkov.tasks;

public class ReverseByte {

    public static void main(String[] args) {

        char[] arrayForResult = new char[8];
        char targetNum = 253;
        System.out.println(Integer.toBinaryString(targetNum)); // System.out.println(Integer.toString(targetNum, 2));
        // char forMove = 0b00000001;
        char forMove = 1;
        
        // char forMoveBack = 0b10000000;
        char forMoveBack = 128;

        System.out.println("_______________________________");
        int result = 0;
        for (int i = 0; i < 8; i++) {
            char tmp = (char) (targetNum & (forMove << i));
            System.out.println(Integer.toBinaryString(tmp));
            // arrayForResult[i] = tmp;
            if (tmp > 0) {
                result = result | forMoveBack >> i;
            }
        }
        byte resB = (byte) result;
        System.out.println(Integer.toBinaryString(result));

        int tt = -5;
        System.out.println(Integer.toBinaryString(tt));
        System.out.println(Integer.toBinaryString((byte) tt));
    }

}
