
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//          Student sc = new Student();
//          sc.setData(101, "Balu", 25, 5487956462L, 58, 85);
          
		// Construtor will always be called during object creation
		Student sc = new Student(101, "Balu", 25, 5487956462L, 58, 85);
		
//          sc.roll=101;
//          sc.name = "Bablu";
//  		  sc.age= 25;
//  		
//  		  sc.phone = 5487956462L;
//  		  sc.marks = 58;
//  		  sc.percentage = 85;
  		  
//  		  Student sc2 = new Student();
		
		// Construtor will always be called during object creation
		
		Student sc2 =new Student(102, "Kumar", 26, 7845924414L, 85, 95);
  		  
//  		  sc2.setData(102, "Kumar", 26, 78459214L, 85, 95);
//  		  sc2.roll=102;
//          sc2.name = "Kumar";
//		  sc2.age= 26;
//		
//		  sc2.phone = 48795642L;
//		  sc2.marks = 85;
//		  sc2.percentage = 95;
		
		  sc.displayinfo();
		  sc2.displayinfo();
	}

}
