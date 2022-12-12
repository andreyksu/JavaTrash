package annikonenkov.tasks;

public class ReverseByte {

    public static void main(String[] args) {

        byte targetNum = -1;

        System.out.println(Integer.toBinaryString(targetNum & 0xFF)); // System.out.println(Integer.toString(targetNum, 2));
        System.out.println("_______________________________");
        char forMove = 0b0000_0001;
        // char forMove = 0x01;
        // char forMove = 1;

        char forMoveBack = 0b1000_0000;
        // char forMoveBack = 0x80;
        // char forMoveBack = 128;

        int result = 0; // Согласно Эккелю, перед сдвигом происходит каст к int а лишь потом происходит сам сдвиг. По этой причине здесь указан int дабы не кастить в каждом цикле, а кастить в конце.

        for (int i = 0; i < 8; i++) {
            char tmp = (char) ((targetNum & 0xFF) & (forMove << i));// Опять, перед сдвигом идет cast к int. Потом поразрядное И и тут снова каст к int переменной targetNum. Если оно отрицательное, то в старших битах будут 1цы. Через 0xFF избавляемся от ненужных 1ц.
            System.out.println(Integer.toBinaryString(tmp));
            if (tmp > 0) {
                result = result | ((forMoveBack >> i) & 0xFF); // Перед сдвигом byte, char, short кастится к int, а потом только сдвигается. При этом, т.к. происходит каст, у нас отрицательное число и сдвиг даст 1-цы в страших битах. Эти 1ы
                                                               // в страших битах убираем 0xFF.
                                                               // Но так как здесь forMoveBack - является char от 1-ц в старших битах мы избавлены, т.к. char не бывает отрицалеьным и единицы в страших битах не будут формироваться при
                                                               // сдвиге. По этому 0xFF осталось для защиты.
            }
        }
        byte resB = (byte) result;
        System.out.println(Integer.toBinaryString(result & 0xFF));
    }

}
