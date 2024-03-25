import java.util.Scanner;

public class Lesson2_Task2 {
    public static void main(String[] args) {
//        Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
//        Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold»

        System.out.println("Введите значение температуры");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if (t > -5) {
            System.out.println("t = " + t + " - Warm");
        }
        if (t > -20 & t <= -5){
            System.out.println("t = " + t + " - Normal");
        }
        if (t < -20) {
            System.out.println("t = " + t + " - Cold");
        }

    }
}
