public class MyFirstClassTask5 {
    public static void main(String[] args) {
//        В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
//        на экран результат деления q на w с остатком. Пример вывода программы (для случая,
//        когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.

        int q = 59;
        int w = 7;

        System.out.println(q + "/" + w + " = " + q / w + " и " + (q - q / w * w) + " в остатке");

    }
}
