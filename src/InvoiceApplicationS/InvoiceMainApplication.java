
/**
	 * This application demonstrates how to calculate total amount of product and using an enhanced for loop display there values of items
	 * also they can add and display more products
	 * @author Hiwot Behabtu
	 * 
	*/


package InvoiceApplicationS;

import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceMainApplication {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		// Identifier declaration 
		
		double tax=0.0;		
		double totalAmounts=0.0;
		boolean toContinue=true;
		String selContinue;
		double totTax=0.0;
		
		System.out.println("Thank you for ordering products with us.");
		System.out.println("The list of items you purchased is below: ");
		
		do{

			//Declare an array list variable and Initialize the array list  and type of array list that is class
			ArrayList<Product> productList=new ArrayList<Product>();
					
			Product product=new Product();			
			
			System.out.println("Enter Product Description:");
			product.setProductName(scan.next());
			System.out.println("Enter Product Price:");
			product.setProductPrice(scan.nextDouble());
			System.out.println("Enter Product Tax Rate:");
			product.setTaxRate(scan.nextDouble());		
			
			
			
			//Add to myArrayList 
			productList.add(product);
			
			tax=product.getProductPrice()*product.getTaxRate();//Calculate price by tax rate and store value to tax variable 
			totTax+=tax;
			totalAmounts+=product.getProductPrice()+tax;	// Calculate price and add tax to get the total amount of the product	
			
		
			//Display  items in an array list using an enhanced for loop 
			for(Product item:productList) {						
				
				System.out.println(item.toString());
				
			}
			
			System.out.println("Would you like to enter more Product Item(y/n)");				
			selContinue=scan.next();
			if(selContinue.equalsIgnoreCase("y"))
			{
				toContinue=true;
			}
			else
			{
				toContinue=false;				
				for(Product item:productList) {					
			
				System.out.println("Item Name: "+item.getProductName());
				System.out.println("Tax Rate: "+item.getTaxRate());
				System.out.println("Tax Charged: "+totTax);
				System.out.println("Total Amount Due:"+totalAmounts);
				}
			}
		}while(toContinue==true);
			
		
	}

}

