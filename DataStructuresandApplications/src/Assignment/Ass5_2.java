package Assignment;
import java.util.LinkedList; 
import java.util.Scanner;
public class Ass5_2 {
	  public static void main(String[] args) {
		  LinkedList<Integer> linkedList = new LinkedList<>();
		  Scanner scanner = new Scanner(System.in);
		  int option = 0;
		  while (option != 4){
			  System.out.println("1.PUSH");
			  System.out.println("2.POP"); 
			  System.out.println("3.DISPLAY");
			  System.out.println("4.EXIT"); 
			  System.out.println("Enter your choice"); 
			  option = scanner.nextInt(); 
			  if (option == 1){
				  System.out.println("Enter the value");
				  int number_1 = scanner.nextInt();
				  linkedList.add(number_1);
				  } 
			  if (option == 2){
				  linkedList.removeLast();
				  System.out.println(linkedList);
				  }
			  if (option == 3) 
				  System.out.println(linkedList);
			  } 
		  }
	  }

