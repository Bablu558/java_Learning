import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(canEqualize(A, B));
        }scanner.close();
    }

    public static String canEqualize(int A, int B) {
        // Implement the logic here
        int sub = B-A;
        if(sub%3==1 || sub%3==0){
        return "YES";
        }else{
            return "NO";
        }
    }
}
