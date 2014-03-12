package thisdemo;

public class ThisDemo {
	int a;
	String str;
	ThisDemo(int i,String s){
		this(i);
		this.str=s;
	}
	ThisDemo(int i){
		a=i;
	}
	public static void main(String[] args) {
		ThisDemo td=new ThisDemo(5, "ab");
		System.out.println(td.a);
	}
}
