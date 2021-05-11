package Assignment;
import java.util.LinkedList;
import java.util.Scanner;
public class Ass3_1 {
	public static void main(String args[]) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int option = 0;
		while(option != 8) {
		System.out.println("1.Create a node");
		System.out.println("2.Insert node at the beginning");
		System.out.println("3.Inset node at the middle");
		System.out.println("4.Inset node at the end");
		System.out.println("5.Delete at begin");
		System.out.println("6.Delete at End");
		System.out.println("7.Delete at middle");
		System.out.println("8.DisplayExit");
		System.out.println("Enter your choice");
		option = sc.nextInt();
		if(option == 1) {
			System.out.println("Enter the value");
			int number_1 = sc.nextInt();
			linkedList.add(number_1);
		}
		if(option == 2) {
			System.out.println("Enter the element to insert");
			int number_2 = sc.nextInt();
			linkedList.addFirst(number_2);
		}
		if(option == 3) {
			System.out.println("enter the position to add the element");
			int position = sc.nextInt();
			System.out.println("Enter the element to insert");
			int number_3 = sc.nextInt();
			linkedList.add(position,number_3);
		}
		if(option == 4) {
			System.out.println("Enter the element to insert");
			int number_4 = sc.nextInt();
			linkedList.addLast(number_4);
		}
		if(option == 5) 
			linkedList.removeFirst();
		if(option == 6) 
			linkedList.removeLast();
		if(option == 7) {
			System.out.println("Enter the position to remove");
			int position = sc.nextInt();
			if(position < linkedList.size())
			   linkedList.remove(position);
			else
			   System.out.println("There is no element at that index");
		}
		System.out.println(linkedList);
		}
	}
}