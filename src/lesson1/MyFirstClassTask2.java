public class MyFirstClassTask2 {
    public static void main(String[] args) {
//        В переменной n хранится двузначное число. Создайте программу, вычисляющую и
//        выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8
//        (2+6)
        int n = 35;
        int m = n / 10 + n % 10;
        System.out.println("Дано число " + n);
        System.out.println("Результат вычисления " + m);
    }
}
