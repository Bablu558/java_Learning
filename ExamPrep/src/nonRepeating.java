import java.util.Scanner;
public class nonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string whitout space");
		String s = sc.next();

		for(int i = 0; i < s.length(); i++){
		    boolean unique = true;

		    for(int j = 0; j < s.length(); j++){
		        if(i != j && s.charAt(i) == s.charAt(j)){
		            unique = false;
		            break;
		        }
		    }

		    if(unique){
		    	System.out.println("First non-repeating character is: "+ s.charAt(i));
		        System.out.println(s.charAt(i));
		        break;
		    }
		}

	}

}
