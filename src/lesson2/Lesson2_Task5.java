import java.util.Scanner;

public class Lesson2_Task5 {
    public static void main(String[] args) {
//        Напишите программу, где пользователь вводит любое целое положительное число.А
//        программа суммирует все числа от 1 до введенного пользователем числа.Для ввода
//        числа воспользуйтесь классом Scanner.Сделать проверку, чтобы пользователь не мог
//        ввести некорректные данные
        int i = 1;
        int s = 0;

        System.out.println("Введите любое целое положительное число");

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.print("Сумма чисел ");
            while (i <= n) {
                System.out.print(i + " ");
                s = s + i;
                i++;
            }
            System.out.println(" равна " + s);
        } else {
            System.out.print("Введены некорректные данные");
        }
    }
}
