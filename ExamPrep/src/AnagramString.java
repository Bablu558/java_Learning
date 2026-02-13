
public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "listen";
		String b = "silent";

		if(a.length() != b.length()){
		    System.out.println("Not Anagram");
		} else {
		    boolean anagram = true;

		    for(int i = 0; i < a.length(); i++){
		        int count1 = 0, count2 = 0;

		        for(int j = 0; j < a.length(); j++){
		            if(a.charAt(i) == a.charAt(j)) count1++;
		            if(a.charAt(i) == b.charAt(j)) count2++;
		        }

		        if(count1 != count2){
		            anagram = false;
		            break;
		        }
		    }

		    System.out.println(anagram ? "Anagram" : "Not Anagram");
		}

	}

}
