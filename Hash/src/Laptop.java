
public class Laptop {
String brand;
   Processor processor; // composition
   Charger ch; // aggregation
	public Laptop(String brand, String ProName) {
	 
	    this.brand = brand; 
//	    System.out.println("Charger '" + brand + "' created.");
	    
	    // creating 
	    processor = new Processor(ProName);
	}
	void setCharger(Charger ch) {
		this.ch=ch;
	}
	public void displayproo() {
		System.out.println("Laptop Brand:" + brand);
		processor.displaypro();
//		ch.displayCh();
	}
}
