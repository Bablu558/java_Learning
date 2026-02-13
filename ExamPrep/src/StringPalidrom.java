
public class StringPalidrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "madam";
       int st =0, r=s.length()-1;
       boolean isPal = true;
       while(st<r) {
    	   if(s.charAt(st) !=s.charAt(r)) {
    		   isPal = false;
    		   break;
    	   }
    	   st++;
    	   r--;
       }
       System.out.println(isPal ? "Palidrom" : "Not");
	}

}
