// This Program calculates the cost of a roadtrip in CAD//

import java.util.*;

public class Question1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***************************************");
    	System.out.println("************** RoadTrip ***************");
        System.out.println("***************************************");

    	System.out.println(" How many kilometers will be travelled?");
    	double kilometers = sc.nextDouble();


    	System.out.println("What is the average distance that the vehicle runs with 1 liter of gas?");
    	double oneliter = sc.nextDouble();
    	double gas = kilometers/oneliter ;

    	double price = gas*1.16;

    	System.out.printf(" The total cost of your trip will be = %.2f$", + price);
    }
}    	 

