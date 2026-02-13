//import java.util.*;

public class Object {
    public static void main(String[] args) {
      for (int i = 1; i<=7; i++) {
			for (int j = 1; j <= 7; j++){
				if (i==4 ||j==4 || (j==1 && (i==1 || i==2 || i==3)) || (j==7 && (i==5 || i==6 || i==7)) || (i==1 && (j==5 || j==6 || j==7))|| i==7 && (j==3 || j==2 || j==1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
  }
}