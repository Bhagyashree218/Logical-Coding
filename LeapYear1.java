//To find if an year is Leap or not
package tricky;
import java.util.Scanner;
public class LeapYear1{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an year");
		int a = sc.nextInt();
		
		if(a%400==0 || (a%4==0 && a%100!=0) ){
			System.out.println(a+" is a leap year");
		}
		else {
			System.out.println(a+" is not a leap year");
		}
		sc.close();
	}
}