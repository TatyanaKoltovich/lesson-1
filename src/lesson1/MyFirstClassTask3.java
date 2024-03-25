public class MyFirstClassTask3 {
    public static void main(String[] args) {
//        В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
//        выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
//        9 (1+2+6).

        int n = 235;
        int n1 = n / 100;
        int n2 = (n - n / 100 * 100) / 10;
        int n3 = n % 10;

        System.out.println("Дано число " + n);
        System.out.println("Результат вычисления " + n1 + "+" + n2 + "+" + n3 + "=" + (n1 + n2 + n3));

    }
}
