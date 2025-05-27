package tricky;

public class SwapTwoWithThird2{
	public static void main(String args[]) {
		int a = 45;
		int b = 89;
		
		System.out.println("a="+a+" b="+b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a="+a+" b="+b);
	}
}