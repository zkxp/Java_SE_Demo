package operator;

public class Operation {
	public static void main(String[] args) {
		int a=017;
		int b=0x1f;
		float f=1e-43f;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(f);
		//按位操作
		
		int m=4;
		int n=6;
		System.out.println(Integer.toBinaryString(m&n));
		System.out.println(Integer.toBinaryString(m|n));
		System.out.println(Integer.toBinaryString(m^n));
		//位移操作
		
		int q=4;
		int p=8;
		System.out.println("位移操作：");
		System.out.println((429496294<1));//16
		System.out.println((p>>3));//1
		System.out.println(-4>>1);//-2
		System.out.println(-4<<1);//-8
		System.out.println(Integer.toBinaryString(-4>>>1));//-8
		
		int max=Integer.MAX_VALUE;
		System.out.println("out:"+max*2);
	}
}
