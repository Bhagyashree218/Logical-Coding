package tricky;

public class SwapTwoWithoutThird3{
	public static void main(String args[]) {
		int a = 54;
		int b = 21;
		
		System.out.println("a="+a+" b="+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("a="+a+" b="+b);
	}
}