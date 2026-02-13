
public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "pRograming";
        
        String res= "";
        for(int i =0; i< str.length();i++) {
        	char ch = str.charAt(i);
        	if(res.toLowerCase().indexOf(ch)== -1)
        		res +=ch;
        }
        System.out.println("Original String : " + str);
        System.out.println("After remove duplicate: " + res);
	}

}
