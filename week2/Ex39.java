package week2;

public class Ex39 {
    public static void printStars(int amount) {
        int times = 1;
        while (times <= amount) {
            System.out.print("*");
            times++;
        }
        System.out.println();

    }


    public static void main(String[] args) {
        printStars(1);
        printStars(2);
        printStars(3);
        printStars(4);
        printStars(5);
        printStars(6);
        printStars(7);
    }
}
