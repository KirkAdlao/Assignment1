//This program prompts the user for a whole number of 3 digits and outputs the sum//
//of the digits of the input.//

import java.util.*;

public class Question3{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	System.out.println("***************************************");
    	System.out.println("Please enter a whole number of 3 digits");
    	System.out.println("***************************************");

    	int input = sc.nextInt();
    	int sum = 0;
    	while (input > 0)
    	{
    		int add = input % 10;
    		sum = sum + add;
    		input = input/10;

    	}	


        System.out.println("The summary of the digits is:" + sum);


    	
    }
}    	    	