package annikonenkov.tasks;

/**
 * Находит сумму цифр в числе.
 * 
 * @author Андрей
 */
public class GetSummNumbers {

    public static void main(String[] args) {
        int targett = 345;
        int div = targett % 100;
        int div1 = targett / 100;
        System.out.println(String.format("target = %d, target %s 100 = %d, target / 100 = %d", targett, "%", div, div1));

        // -------------------------
        final int target = 8888;

        int degree = 1; // Является порядком числа.
        final int growUp = 10;
        int reduce = 1;

        // Ищем порядок числа. Далее этот порядок будем использовать для деления.
        while (target / degree > 10) {
            degree = degree * growUp;
        }

        System.out.println(String.format("Порядок целевого числа = %d", degree));

        // Непосредственное деление на порядок и постеменное уменьшение порядка.
        int tmp = target;
        int result = 0;
        while (tmp >= 10) {
            result = result + (tmp / (degree / reduce));// Результат целочисленного деления на порядок числа.
            tmp = target % (degree / reduce);// Результат остатка от деления.
            reduce = reduce * growUp;// Уменьшатор порядка числа.
        }
        result = result + tmp;
        System.out.println(result);
    }
}
