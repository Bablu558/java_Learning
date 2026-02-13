
public class countWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     String s = "I   love   Java";
     int count = 0;
     boolean isWord = false;
     
     for(int i = 0; i<s.length();i++) {
    	 if(s.charAt(i) != ' ' && !isWord) {
    		 count++;
    		 isWord = true;
    		 
    	 } else if(s.charAt(i)== ' ') {
    		 isWord = false;
    	 }
     }
     System.out.println(count);
	}

}
