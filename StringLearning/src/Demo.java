
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class InbuiltStringsMethodsDemo{

		String str1= new String("Kodnest");
		String str2 = new String("Kodnest");
		String str3= new String("KODnest");
		String str4= new String("Codnest");
		//if string contents / values has to be comapred
		// use equals(), or equalsIgnoreCase() or comapгeTo()
		System.out.println("============");
		System.out.println(str1=str2);
		System.out.println(str1=str3); 
		System.out.println("=============");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println("=========");
		//compare the string by ignoring the cases..
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println("========");
		System.out.println(str1.compareTo(str4));
		System.out.println(str4.compareTo(str1));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareToIgnoreCase(str3));
	}
	}
		
}
}
