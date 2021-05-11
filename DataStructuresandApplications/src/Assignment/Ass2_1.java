package Assignment;
import java.util.Scanner;
public class Ass2_1 {
	public static void main(String args[]) {
		int sum=0;
		System.out.println("Enter one integer number");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		for(int i=1;i<=a;i++) {
			sum=sum+i;
		}
		System.out.println("Sum is" + " " +sum);
		}
    }
