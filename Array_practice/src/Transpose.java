import java.util.Scanner;
public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter row:");
		 int rows = sc.nextInt();
		 System.out.println("Enter column:");
		 int cols = sc.nextInt();
		 
		 int[][] originalMatrix = new int[rows][cols];
		 System.out.println("Enter element");
		 for(int i=0;i<rows;i++) {
			 for(int j=0;j<cols;j++) {
				 originalMatrix[i][j]= sc.nextInt();
			 }
		 }
		 // transpose
		 int[][] transposeM = new int[cols][rows];
		 for(int i=0;i<rows;i++) {
			 for(int j=0;j<cols;j++) {
				 transposeM[j][i] = originalMatrix[i][j];
			 }
		 }
		 //printing
		 System.out.println("Original Matrix:");
		 for(int i=0;i<rows;i++) {
			 for(int j=0;j<cols;j++) {
				 System.out.print(originalMatrix[i][j]+ " ");
			 }
			 System.out.println();
		 }
		 
		 System.out.println("Transpose Matrix:");
		 for(int i=0;i<cols;i++) {
			 for(int j=0;j<rows;j++) {
				 System.out.print(transposeM[i][j]+ " ");
			 }
			 System.out.println();
		 }
	}

}
