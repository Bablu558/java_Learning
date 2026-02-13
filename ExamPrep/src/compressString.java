
public class compressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbc";
		String res = "";
		int count = 1;

		for(int i = 1; i <= s.length(); i++){
		    if(i < s.length() && s.charAt(i) == s.charAt(i - 1)){
		        count++;
		    } else {
		        res += s.charAt(i - 1) + "" + count;
		        count = 1;
		    }
		}

		System.out.println(res);

	}

}
