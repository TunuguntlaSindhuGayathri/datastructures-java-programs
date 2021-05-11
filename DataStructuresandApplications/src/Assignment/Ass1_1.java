package Assignment;
import java.util.Scanner;
public class Ass1_1{
	public static void main(String args[]) {
		int i;
		Scanner in=new Scanner(System.in);
		int arr[]=new int[10];
				int arr1[]=new int[5];
				int arr2[]=new int[5];
				System.out.println("Enter");
				for(i=0;i<10;i++) {
					arr[i]=in.nextInt();
				}
				for (i=0;i<5;i++) {
					arr1[i]=arr[i];
					System.out.print(arr1[i]+" ");
				}
				System.out.println(" ");
				for(i=0;i<5;i++) {
					arr2[i]=arr[5+i];
					System.out.print(arr2[i]+" ");
				}
	}
}
