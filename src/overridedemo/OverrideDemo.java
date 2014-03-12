package overridedemo;



class shap{
	public void draw(int i){
		System.out.println("draw"+i);
	}
	public void draw(float f){
		System.out.println("draw"+f);
	}
	public void draw(String	s){
		System.out.println("draw"+s);
	}
}
public class OverrideDemo extends shap {
	@Override
	public void draw(String s){
		System.out.println("draw sub:"+s);
	}
	//@Override 
	//加上注解，会报错
	public void draw(String s,int a){
		System.out.println("draw"+s+a);
	}
	public static void main(String[] args) {
		OverrideDemo od=new OverrideDemo();
		od.draw("s");
	}
}