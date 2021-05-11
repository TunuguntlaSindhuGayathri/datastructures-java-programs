package Assignment;
import java.util.Scanner;
public class Ass2_3 {
    public static void main(String args[]) {
    	System.out.println("Enter one integer");
    	Scanner in=new Scanner(System.in);
    	int a = in.nextInt();
    	for(int i=1;i<=10;i++) {
    		System.out.println(a+"*"+i+"="+a*i);
    	}
    }
}
