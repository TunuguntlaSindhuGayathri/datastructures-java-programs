package Assignment;
import java.util.Scanner;
public class Ass2_2 {
	static int a=0,b=1,c=0;
	static void FSeries(int count) {
		if (count>0) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
			FSeries(count-1);
		}
	}
	public static void main(String args[]) {
		System.out.println("how many numbers you want in the sequence");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		System.out.print(a+" "+b);
		FSeries(count-2);
	}
}	
	