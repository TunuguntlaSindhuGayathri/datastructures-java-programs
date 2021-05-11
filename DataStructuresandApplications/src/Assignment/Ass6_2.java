package Assignment;
import java.util.*;
public class Ass6_2{
	static boolean areBracketsBalanced(String expr) 
	{
		Deque<Character> stack = new ArrayDeque<Character>();
		for (int i = 0; i < expr.length(); i++)
		{
			char x = expr.charAt(i);
			if (x == '(' || x == '[' || x == '{'|| x == '$') 
			{
				stack.push(x);
				System.out.println("pushed:"+ x);
				System.out.println("popped:"+x);
                continue;
                }
			if (stack.isEmpty())
				return false; 
			char check;
			switch (x) 
			{
			case ')': 
				check = stack.pop(); 
			if (check == '{' || check == '[')
				return false;
			break;
			case '}': 
				check = stack.pop();
				if 
				(check == '(' || check == '[')
					return false; 
				break;
				case '$':
					check = stack.pop();
					if(check == '('|| check =='[')
						break; 
					}
			}
		return (stack.isEmpty());
		}
	public static void main(String[] args) {
	String expr = new String();
	Scanner in =new Scanner(System.in);
	System.out.println("enter the paranthesis string ends with $");
	expr =in.nextLine();
	System.out.println("pushed$");
	if (areBracketsBalanced(expr))
		System.out.println("Balanced paranthesis");
	else 
		System.out.println("Not Balanced ");
	}
}