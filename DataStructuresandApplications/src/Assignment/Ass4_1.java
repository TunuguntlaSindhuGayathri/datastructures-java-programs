package Assignment;
import java.util.LinkedList; 
import java.util.Scanner;
public class Ass4_1 {
   public static void main(String[] args) {
	   LinkedList<Integer> linkedList = new LinkedList<>();
	   Scanner scanner = new Scanner(System.in);
	   int option = 0; 
	   while (option != 9){
		   System.out.println ("1.Create a node");
		   System.out.println ("2.Insert node at the beginning"); 
		   System.out.println ("3.Insert node at the middle"); 
		   System.out.println("4.Insert node at the end");
		   System.out.println("5.Delete at begin");
		   System.out.println("6.Delete at End"); 
		   System.out.println("7.Delete at middle"); 
		   System.out.println("8.Display"); 
		   System.out.println("9.Exit"); 
		   System.out.println("Enter your choice"); 
		   option = scanner.nextInt();
		   if (option == 1){
			   System.out.println("Enter the value");
			   int number_1 = scanner.nextInt(); 
			   linkedList.add(number_1);
			   }
		   if (option == 2){
			   System.out.println("Enter the element to insert");
			   int number_2 = scanner.nextInt();
			   linkedList.addFirst(number_2);
			   }
		   if (option == 3){
			   System.out.println("enter the position to add the element");
			   int position = scanner.nextInt();
			   System.out.println("Enter the element to insert");
			   int number_3 = scanner.nextInt();
			   linkedList.add(position,number_3);
			   }
		   if (option == 4){ 
			   System.out.println("Enter the element to insert");
			   int number_4 = scanner.nextInt(); 
			   linkedList.addLast(number_4);
			   } 
		   if (option == 5) 
			   linkedList.removeFirst();
		   if (option == 6)
			   linkedList.removeLast();
		   if (option == 7){ 
			   System.out.println("Enter the position to remove"); 
			   int position = scanner.nextInt();
			   if (position < linkedList.size())
				   linkedList.remove(position);
			   else System.out.println("There is no element at that index"); 
			   }
		   System.out.println(linkedList);
		   }
	   }
   }