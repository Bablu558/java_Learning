
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Student sc = new Student();
          sc.roll=101;
          sc.name = "Bablu";
  		  sc.age= 25;
  		
  		  sc.phone = 5487956462L;
  		  sc.marks = 58;
  		  sc.percentage = 85;
  		  
  		  Student sc2 = new Student();
  		  sc2.roll=102;
          sc2.name = "Kumar";
		  sc2.age= 26;
		
		  sc2.phone = 48795642L;
		  sc2.marks = 85;
		  sc2.percentage = 95;
		  sc.displayinfo();
		  sc2.displayinfo();
	}

}
