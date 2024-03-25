import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int san= random.nextInt(1,5);
        System.out.println(san);
        System.out.println(method(scanner.nextInt(), san));
        System.out.println("hello");
    }

    public static boolean method(int number,int number1) {

        return number == number1;


    }
}
