package TutorialPackage;

public class Customer {
	private String name;
	private double evilFunds;
	private String secretLairlocation;

	public Customer(String name, String secretLairlocation, double evilFunds) {
		this.name = name;
		this.evilFunds = evilFunds;
		this.secretLairlocation = secretLairlocation;

	}

	public void setname(String name) {
		this.name = name;
	}
	
	public double getevilFunds() {
		return evilFunds;
	}
	
	public void setsecretLairlocation(String secretLairlocation) {
		this.secretLairlocation = secretLairlocation;
	
}
	public void setevilFunds(double evilFunds) {
		this.evilFunds = evilFunds;
	}
	
	public String getname() {
		return name;
	}
	
	public void getsecretLairlocation() {
		this.secretLairlocation = secretLairlocation;
	}

	public String toString() {
		return "Lair: " + secretLairlocation + " name: " + Name + " Evil Funds: " + evilFunds;
	}

	public void addFunds(double addingfunds) {
	    this.evilFunds = this.evilFunds + addingfunds;
	}


	//invoice run 1
	Customer a = new Customer("Island", "Dr. Evil", 1230.0);
	Customer in = new Customer(a);
	in.addToOrder(new Product("Flame Thower",123.80), 3)
	in.addToOrder(new Product("Sharks", 105.2),2);
	in.addToOrder(new Product("Lasers",50.5),20);
	
	runCustomer(a,in); //runs invoice

    //invoice run 2
	Customer b = new Customer("Cave", "Commander Crime", 1230.0);
	Customer in = new Customer(b);
	in.addToOrder(new Product("Bombs",123.80), 3);
	in.addToOrder(new Product("Helicopter", 105.2),2);
	in.addToOrder(new Product("Tank",50.5),20);

	
	runCustomer(b,in); //runs invoice

	//invoice run 3
	Customer c = new Customer("Submarine", "The Pirate", 1230.0);
	Customer in = new Invoice(c);
	in.addToOrder(new Product("Killer Dolphins",123.80), 3);
	in.addToOrder(new Product("Torpedos", 105.2),2);
	in.addToOrder(new Product("Explosive Fish",50.5),20);

	
	runCustomer(c,in); //runs invoice

	//invoice run 4
	Customer d = new Customer("Tower", "Mr. Malicious", 1230.0);
	Customer in = new Customer(d);
	in.addToOrder(new Product("",123.80), 3);
	in.addToOrder(new Product("Helicopter", 105.2),2);
	in.addToOrder(new Product("Tank",50.5),20);
	
	runCustomer(d,in); //runs invoice


}