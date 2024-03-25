public class MyFirstClassTask6 {
    public static void main(String[] args) {
//        Написать программу которая будет менять местами значение целочисленных
//        переменных. Пример:
//        int a = 1; int b = 2;
////код (ваше решение)
//        sout(a); //выведет 2
//        sout(b); //выведет 1
//        Усовершенствовать программу, использовать только 2 входные переменные (a,b);

        int a = 5;
        int b = 3;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Даны числа a = 5 и b = 3");
        System.out.println("После того, как поменяли числа местами: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
