
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int revs = 0;

		while(num !=0) {
			int digit = num %10;
			revs = revs*10+digit;
			num = num/10;
		}
		System.out.println(revs);
	}

}
