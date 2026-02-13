
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Processor pro = new Processor("Intel Core i7"); 
//        System.out.println("Processor name: " + pro.name);
        
        
        Laptop  lap = new Laptop("Acer", "I5"); 
        Charger ch = new Charger("Black");
        ch.displayCh();
        lap.setCharger(ch);
        lap.displayproo();
        
        
//        Charger  chr = new Charger("Dell"); 
//        System.out.println("Charger name: " + chr.name);
        
        

	}

}
