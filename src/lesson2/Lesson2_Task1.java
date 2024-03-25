import java.util.Scanner;

public class Lesson2_Task1 {
    public static void main(String[] args) {
//        Напишите программу, которая будет принимать на вход число из консоли и на выход
//        будет выводить сообщение четное число или нет. Для определения четности числа
//        используйте операцию получения остатка от деления (операция выглядит так: '% 2')

        System.out.println("Введите любое целое число25");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("Число a = " + a + " - четное");
        } else {
            System.out.println("Число a = " + a + " - нечетное");
        }
    }
}
