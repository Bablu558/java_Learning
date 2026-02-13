
public class LongestWord {

	public static void main(String[] args) {
		String s = "Java is very powerful language";
		String word = "", longest = "";

		for(int i = 0; i <= s.length(); i++){
		    if(i == s.length() || s.charAt(i) == ' '){
		        if(word.length() > longest.length())
		            longest = word;
		        word = "";
		    } else {
		        word += s.charAt(i);
		    }
		}

		System.out.println(longest);
}}