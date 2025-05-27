package tricky;
import java.util.Scanner;
public class PrimeNumber7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = 79;//sc.nextInt();
		int temp = 0;
		for(int i=2; i<=(n/2)-1;i++) {
			if(n%i==0) {
				temp++;
				break;
			}
		}
		if(temp>0) {
			System.out.println("Not prime");
		}
		else {
			System.out.println("Prime");
		}
		sc.close();
	}
}
