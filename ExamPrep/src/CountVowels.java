
public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "education";
        int v=0,c=0;
        for(int i=0;i<s.length();i++) {
        	char ch = s.charAt(i);
        	if(ch=='a'||  ch=='e'|| ch=='i'||ch=='o'||ch=='u')
        		v++;
        	else if(ch>='a' && ch<='z')
        		c++;
        }
        System.out.println("vowels is: "+ v + " "+ "consonents is: " + c);
	}

}
