import java.util.Scanner;

public class palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Enter the string:");
	            String str = sc.nextLine();
	            String org = str.toLowerCase();
	            
//	            reverse
	            String reversed = "";
	            for(int i=org.length()-1;i>=0;i--) {
	            	reversed += org.charAt(i);
	            	
	            }
	            if (org.equals(reversed)) {
	                System.out.println("The string '" + str + "' is palidrom");
	            } else {
	                System.out.println("The string '" + str + "' is not palidrom");
	            }
	            
	          
	            
	             
		}
	}


