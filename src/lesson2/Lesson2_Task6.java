public class Lesson2_Task6 {
    public static void main(String[] args) {
        //Необходимо написать программу, которая бы вывела в консоль звездочки вот таким образом, как на картинке ниже
        //*****
        //*****
        //*****

        int m = 1;
        while (m <= 3) {
            int n = 1;
            while (n <= 5) {
                if (n < 5) {
                    System.out.print("*");
                } else {
                    System.out.println("*");
                }
                n++;
            }
            m++;
        }
    }
}
