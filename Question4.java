//This program prompts the user for a URL//
import java.util.Scanner;
public class Question4 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter A URL: ");
        String url = sc.nextLine().trim();
        int len = url.length();
        System.out.println("Verifying an URL with " + len + " characters");
        String verify = "https://";
        boolean isValid = true;
        for (int i = 0; i < verify.length() && isValid; i++) {
            isValid = (url.charAt(i) == verify.charAt(i));
        }
            System.out.println("Is this a valid and secure URL? " + isValid);
    }
}