public class Lesson2_Task4 {
    public static void main(String[] args) {
        //Необходимо, чтоб программа выводила на экран вот такую последовательность:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while
        int n = 7;
        int i = 1;
        while (i <= 14) {
            System.out.println((n*i));
            i++;
        }

    }
}
