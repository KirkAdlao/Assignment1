//This program generates a random number between 0 and 100, and performs mathematical operations with it.// 
import java.util.*;

public class Question5{

    public static void main(String[] args) {
        Random rand = new Random();
        double number = rand.nextInt(101);

        System.out.printf("The random number is: %.00f%n", number);
        System.out.println("========================================================");
        System.out.printf("The power of 2 of %.0f is %.2f%n", number, Math.pow(number, 2));
        System.out.printf("The power of 3 of %.0f is %.2f%n", number, Math.pow(number, 3));
        System.out.printf("The square root of %.0f is %.2f%n", number, Math.sqrt(number));
        System.out.printf("The natural lof of %.0f is %.2f%n", number, Math.log(number));
        System.out.printf("The log of base 10 of %.0f is %.2f%n", number, Math.log10(number));
        System.out.println("========================================================");
    }
}    
