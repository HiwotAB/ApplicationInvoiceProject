
/*
* 
*/
package InvoiceApplicationS;

public class Product {
	private double productPrice=0.0;
	private String productName=null;
	private double taxRate=0.0;
	
		public void setProductPrice(double price)
		{			
			this.productPrice=price;
		}
		public double getProductPrice()
		{
			return productPrice; 
		}
		public void setProductName(String pname)
		{			
			this.productName=pname;
		}
		public String getProductName()
		{
			return productName; 
		}
		public void setTaxRate(double tax)
		{			
			this.taxRate=tax;
		}
		public double getTaxRate()
		{	
					
			return taxRate/100; 
		}
		@Override
		public String toString() {
			
			return " Product Description=" + productName +
					"\n Product Price=" + productPrice + 
					",\n Tax Rate=" + taxRate;
					
			
		}
		
		
	
		
}
