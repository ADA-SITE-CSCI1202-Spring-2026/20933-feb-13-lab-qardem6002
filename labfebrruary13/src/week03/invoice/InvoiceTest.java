package week03.invoice;
public class InvoiceTest {

	public static void main(String[] args) {
		Invoice inv = new Invoice("111","iphone",500,1200.50);
		double total = inv.getInvoiceAmount();
		System.out.println("How much it will cost total: "+total);
		
		
		
		System.out.println("Current product number: "+inv.getNumber());
		inv.setNumber("112");
		System.out.println("New number: "+inv.getNumber());
		
		
		
		System.out.println("Currect description: "+inv.getDescription());
		inv.setDescription("samsungphone");
		System.out.println("New description: "+inv.getDescription());
		
		
		System.out.println("Current quantity: "+inv.getQuantity());
		inv.setQuantity(1000);
		System.out.println("New quantity: "+inv.getQuantity());
		
		
		System.out.println("Current price: "+inv.getPrice());
		inv.setPrice(900.95);
		System.out.println("New price: "+inv.getPrice());
		
		
		System.out.println("New invoice amount: "+inv.getInvoiceAmount());

	}

}
