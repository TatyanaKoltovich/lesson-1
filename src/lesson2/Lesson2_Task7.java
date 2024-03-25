public class Lesson2_Task7 {
    public static void main(String[] args) {
//        2.Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что:
//
//        первый и второй члены последовательности равны единицам
//        а каждый следующий — сумме двух предыдущих
//        То есть числа Фибоначчи - это 1  1  2  3  5  8  13  21  34  55  89  и т.д.

        int i = 1;
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;
        int s = 0;

        System.out.print(n1 + " ");
        while (i <= (11-1)){

            System.out.print(n2 + " ");
            n3 = n1 + n2;
            s = s + n3;

            n1 = n2;
            n2 = n3;
            i++;
        }
        System.out.println("*****");
        System.out.println(s);

    }
}
