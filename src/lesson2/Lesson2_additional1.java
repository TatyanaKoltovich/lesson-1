import java.util.Scanner;
public class Lesson2_additional1 {
    public static void main(String[] args) {
        //Напишите проверку, является ли заданное число простым.
        int i = 2;
        int t = 0;
        boolean k = true;

        System.out.println("Введите любое целое число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s;

        while (i <= 9) {
            t = n - (n % i);
            if (t == n) {
                if (i != n) {
                    k = false;
                }
            }
            i++;
        }
        if (k == true) {
            s = " является простым числом";
        } else {
            s = " не является простым числом";
        }
        System.out.println(n + s);
    }
}
