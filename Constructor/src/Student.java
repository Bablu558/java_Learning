
 class Student {
//		int roll;
//		String name;
//		int age;
//		long phone;
//		int marks;
//		double percentage;
	 
	// we an also give encapsualtion in cunstroctor
		
	    private int roll;
		private String name;
		private int age;
		private long phone;
		private int marks;
		private double percentage;
		
		
		
		// constructor - special setter method
		// Constructor name must be same as of class name
		// Cunstructor will not have return type
		// Construtor will always be called during object creation
		
//		void setData(int a, String b, int c, long d, int e, double f) {
			
		
		// Constructor name must be same as of class name
//		 Student(int a, String b, int c, long d, int e, double f) {
//		    roll = a;
//			name = b;
//			age = c;
//			phone = d;
//			marks = e;
//			percentage = f;
//		}
		
		
		// Shadowing problem
		 Student(int roll, String name, int age, long phone, int marks, double percentage) {
			 
			 // after hover on it :- The assignment to variable roll has no effect
		      // here java taking both as local variable
			 
//			    roll = roll;	
//			    name = name;
//				age = age;
//				phone = phone;
//				marks = marks;
//				percentage = percentage;     

				
			 // to treat this variable as  instance(object) variable of left side of variable  , use "this" keyword
			   
				this.roll = roll;	
			    this.name = name;
				this.age = age;
				this.phone = phone;
				this.marks = marks;
				this.percentage = percentage;
			}
		
		void displayinfo() {
			System.out.println("Roll: " + roll);
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Phone: " + phone);
	        System.out.println("Marks: " + marks);
	        System.out.println("Percentage: " + percentage);
	        System.out.println("---------------------------");
			
		}
	}

