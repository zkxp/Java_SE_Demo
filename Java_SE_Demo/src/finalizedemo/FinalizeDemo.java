package finalizedemo;

public class FinalizeDemo {
	public static void main(String[] args) {
		Book book=new Book(true);
		book.checkIn();
		Book novel=new Book(true);
		novel.checkOut=true;
		System.gc();
	}
}
