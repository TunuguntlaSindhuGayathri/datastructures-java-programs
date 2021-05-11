package Assignment;
import java.util.Scanner;
public class Ass1_3 {
	public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int i,j,p,q;
    System.out.println("enter p value no.of array elements ");                 
    p=in.nextInt(); 
    int arr[]=new int[p];
    System.out.println("enter array elemets");
    for(i=0;i<p;i++) {
    	arr[i]=in.nextInt();
    }
    for(i=0;i<p;i++) {
    for(q=i+1;q<p;q++) {
    	if(arr[q]<arr[i]) {
    	  j=arr[q];
    	  arr[q]=arr[i];
    	  arr[i]=j;
    	  }
        }
    }   
    int max_diff,min_diff;
    max_diff=arr[p-1]-arr[0]; 
    min_diff=arr[1]-arr[0]; 
    System.out.println(max_diff);
    System.out.println(min_diff);
	}
}