package TutorialPackage;

public class TestInvoice {
	public static void main(String[] args) {

		// create 3 additional invoice runs
		// add at least 5 items to invoice order for each invoice run
// make sure in at least one of the runs the customer can not afford the purchase
		
		//invoice run 1
		Customer a = new Customer(Island", "Dr. Evil", 1230.0);
		Invoice in = new Invoice(a);
		in.addToOrder(new Product("Flame Thower",123.80), 3);
		in.addToOrder(new Product("Sharks", 105.2),2);
		in.addToOrder(new Product("Lasers",50.5),20);
	
		runInvoice(c,in); //runs invoice


		
		//invoice run 2
		Customer b = new Customer("Cave", "Commander Crime", 1230.0);
		Invoice in = new Invoice(b);
		in.addToOrder(new Product("Bombs",123.80), 3);
		in.addToOrder(new Product("Helicopter", 105.2),2);
		in.addToOrder(new Product("Tank",50.5),20);

		//invoice run 3
		Customer c = new Customer("Submarine", "The Pirate", 1230.0);
		Invoice in = new Invoice(c);
		in.addToOrder(new Product("Killer Dolphins",123.80), 3);
		in.addToOrder(new Product("Torpedos", 105.2),2);
		in.addToOrder(new Product("Explosive Fish",50.5),20);

		
		//invoice run 4
		Customer d = new Customer("Tower", "Mr. Malicious", 1230.0);
		Invoice in = new Invoice(d);
		in.addToOrder(new Product("",123.80), 3);
		in.addToOrder(new Product("Helicopter", 105.2),2);
		in.addToOrder(new Product("Tank",50.5),20);

	}//end main
	
	//do not modify code below
	public static void runInvoice(Customer c, Invoice i) {
		i.printInvoice();

		if(c.getEvilFunds()- i.amountDue() < 0) {
			System.out.println("Evil villian credit union to the rescue!!");	
			c.addFunds(i.amountDue() - c.getEvilFunds());
			System.out.println("New funds total: " + c.getEvilFunds());
i.printInvoice();

				
	}//end runInvoice

}//end TestInvoice

}
