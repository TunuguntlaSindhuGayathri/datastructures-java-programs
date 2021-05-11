import java.util.Scanner;
class Stack{
 int size;
 int top;
 char[] a;
 boolean isEmpty()
  {
    return (top < 0);
   }
 Stack(int n)
  {
    top = -1;
    size = n;
    a = new char[size];
  }
 boolean push(char x)
  {
    if (top >= size)
    {
      System.out.println("Stack Overflow");
      return false;
     }
    else 
    {
    	a[++top] = x; return true;
    	}
   }
 char pop() 
 {
	 if (top < 0)
	 {
		 System.out.println("Stack Underflow");
		 return 0; 
		 }
	 else
	 {
		 char x = a[top--];
		 return x;
		 }
	 }
 }
class main
{
	public void reverse(StringBuffer str) 
	{
		int n = str.length();
		Stack obj = new Stack(n);
        int i;
        for (i = 0; i < n; i++) 
        	obj.push(str.charAt(i));
        for (i = 0; i < n; i++) 
        {
        	char ch = obj.pop(); 
        	str.setCharAt(i,ch);
        	}
        }
	public class Main{
	public void main(String args[]) 
	{
		StringBuffer a= new StringBuffer(); 
		Scanner in=new Scanner(System.in);
		System.out.println("Enter string to reversal");
		a.append(in.nextLine()); 
		reverse(a); 
		System.out.println("String after reversal: " );
		System.out.println(a);
		}
	}
        }
