package cz.czechitas.javaii;

import java.util.Scanner;

public class IceCreamApp {

	public static void main(String[] args) {

		IceCreamApp myApp = new IceCreamApp();
		myApp.run();
	}

	public void run() {
		
		String iceCreamType;
		int numberOfScoops;
		
		int bucketSize;
		bucketSize = 10;
		
		int cnt;
		Scanner scanner = new Scanner(System.in);
		
		for (cnt = 0; cnt < 10; cnt ++) {
		
			// Print Hello message
			System.out.println("Hello, dear Customer");
			// Get customer's input ( and validate)
 			System.out.print("Enter the ice-cream type: ");
			iceCreamType = scanner.nextLine();
			
			
			System.out.print("Enter the number of Scoops: ");
			numberOfScoops = scanner.nextInt();
			scanner.nextLine();
			
		
			//testing
			System.out.println("Ice-cream type is " + iceCreamType);
			System.out.println("Number of scoops is " + numberOfScoops);
			
			// Check if we have enough ice ream
		
				
					
			
			if (bucketSize >= numberOfScoops){
				// Yes - subtract form bucket + confirm to the customer
				
				bucketSize  = bucketSize - numberOfScoops;
				// sort version bucketSize -= numberOfScoops
				System.out.println(" Your bucket size is " + bucketSize);
		    } else {
		    	
		    	System.out.println("Sorry, no more");
		    	
		    	// No - sorry, bye
		    }
		}
	
	}        
	
}