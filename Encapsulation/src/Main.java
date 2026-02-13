
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk = new Book();
//		bk.pageNo = 100;
//		bk.pageNo = -100;
//		System.out.println(bk.pageNo);
		
		// encapsulation cant access directly pageNo
		bk.setter(-100);
		System.out.println(bk.getter()); // by default zero will come

	}

}
