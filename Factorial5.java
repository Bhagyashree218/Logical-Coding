package tricky;
import java.util.Scanner;
public class Factorial5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int fact =1;
		for(int i=a;i>0;i--) {
			fact = fact*i;
		}
		System.out.println(fact);
		sc.close();
	}
		
}
