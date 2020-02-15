import java.util.*;

public class CADProduct{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	System.out.println("****** CanadianProduct ******");
 
    	final double TAX = .14975;
    	double item, tax; 

    	System.out.println(" What is the price of the Canadian Product? ");
    	item = sc.nextDouble();

    	tax = item * TAX;

    	System.out.println("The tax of the item is " + tax);
    	System.out.println(" The final price of the item is:");
    	System.out.println(item + tax);
    	System.out.printf("total cost = %.2f$", + item + tax);




   }
}    

    	







