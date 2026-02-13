
public class Book {
//  int pageNo;
	
	// encapsulation
//	private int pageNo;
//	public void setter(int x) {
//		pageNo = x;
//	}
//	public int getter() {
//		return pageNo;
//	}
	
	
	
	private int pageNo;
	public void setter(int x) {
		if(x>0) {
		pageNo = x;
		}else {
			System.out.println("Invalid Data, Data Should be Greater Than Zero");
		}
	}
	public int getter() {
		return pageNo;
	}
}
