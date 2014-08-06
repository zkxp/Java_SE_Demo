package finalizedemo;

public class Book {
	boolean checkOut=false;
	Book(boolean checkOut){
		this.checkOut=checkOut;
	}
	void checkIn(){
		checkOut=false;
	}
	protected void finalize(){
		System.out.println("action");
		if(checkOut){
			System.out.print("Error:checked out");
			
		}
	}
}
