import java.util.Scanner;
public class K_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println("Enter target");
		int tg = sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++) {
			if(sum+ i > tg) break;
			sum+=i;
			System.out.print(i+ " ");
		}
		
	}

}
