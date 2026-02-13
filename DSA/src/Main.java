//
//import java.util.Scanner;
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the number of classes");
//        int classes = scan.nextInt();
//        System.out.println("Enter the number of student in each classes");
//        int students = scan.nextInt();
//        int[][] arr = new int[classes][students];
//        for(int i=0; i<=classes-1; i++) {
//        	for(int j =0; j<=students-1; j++) {
//        		System.out.println("enter marks for class " +(i+1)+ " Student " + (j+1));
//        		arr[i][j] = scan.nextInt();
//        	}
//        }
//        System.out.println("Stored Data:");
//        for(int i=0; i<=classes-1; i++) {
//        	for(int j =0; j<=students-1; j++) {
//        		
//        		System.out.print( arr[i][j] + " ");
//        		
//        	}
//        	System.out.println();
//        }
//        
//	}
//
//}











// Requirement is

//We need to store the names for employees present in multiple companies.

//Take total num of companies and num of employees in each company as user input.

//Take names for each employees in each company also as user input

//Display the names for each employee in each company.






//import java.util.Scanner;
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        Scanner scan = new Scanner(System.in);
//        
//        System.out.println("Enter the total number of Company");
//        int company = scan.nextInt();
//        
//        System.out.println("Enter the number of employees in each company:");
//        int empPerCompany = scan.nextInt();
//        String[][] empName = new String[company][empPerCompany];
//        
//        scan.nextLine();
//        
//        System.out.println("\n--- Entering Employee Names ---");
//        
//        for(int i=0; i<=company-1; i++) {
//        	for(int j =0; j<=empPerCompany-1; j++) {
//        		System.out.println("Enter name for company " +(i+1)+ " Employee " + (j+1) + ": ");
//        		empName[i][j] = scan.nextLine();
//        	}
//        }
//        System.out.println("\\n--- Displaying Stored Employee Data ---");
//        for(int i=0; i<=company-1; i++) {
//        	System.out.print("Company " + (i + 1) + " Employees: ");
//        	for(int j =0; j<=empPerCompany-1; j++) {
//        		
//        		System.out.print( empName[i][j] + " ");
//        		if (j < empPerCompany - 1) {
//                    System.out.print(", ");
//                }
//        		
//        	}
//        	System.out.println();
//        }
//        
//	}
//
//}
//














public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
//        int [][] classMarks = {
//        		{90,91,92},
//        		{80,81},
//        		{70,71,72,73}
//        };
		
		// OR
		
//		int[][] arr = new int[3][];
//		arr[0] = new int[3];
//		arr[1] = new int[2];
//		arr[2] =new int[4];
//		
//		arr[0][0] = 90;
//		arr[0][1] = 91;
//		arr[0][2] = 92;
//		
//		arr[0][0] = 80;
//		arr[0][1] = 81;
//		
//		arr[0][0] = 70;
//		arr[0][1] = 71;
//		arr[0][2] = 72;
//		arr[0][3] = 73;
//		System.out.println(arr[0][0]);
        
        System.out.println("Stored data Marks by Class:");
        
//        for(int i=0; i < classMarks.length; i++) {
//        	System.out.println("\nClass-" + (i+1) + ":");
//        	
//        	for(int j = 0; j< classMarks[i].length; j++) {
//        		System.out.println(" Student " + (j+1) + " marks : " + classMarks[i][j]);
//        	}
//        }
        
	}

}

