import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class Main {

    static class Node {
        int key;
        Node left, right;

        Node(int key)
        {
            this.key = key;
            left = null;
            right = null;
        }
    }
    static Node root;
    static Node temp = root;
 public static boolean flag=false;
    static void inorder(Node temp)
    {
        if (temp == null)
            return;
        inorder(temp.left);
        System.out.println(temp.key + " ");
        inorder(temp.right);
    }
    static void preorder(Node temp)
    {
        if (temp == null)
            return;
        System.out.println(temp.key + " ");
        inorder(temp.left);
        inorder(temp.right);
    }
    static void postorder(Node temp)
    {
        if (temp == null)
            return;
        inorder(temp.left);
        inorder(temp.right);
        System.out.println(temp.key + " ");
    }


    static void insert(Node temp, int key)
    {
        if (temp == null) {
            root = new Node(key);
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);

        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            }
            else
                q.add(temp.left);
            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            }
            else
                q.add(temp.right);
        }
    }

    static void searchNode(Node temp, int value){

        if(root == null){
            System.out.println("Tree is empty");
        }
        else{

            if(temp.key == value){
                flag = true;
                System.out.println("Element found");
                return;
            }

            if(flag == false && temp.left != null){
                searchNode(temp.left, value);
            }

            if(flag == false && temp.right != null){
                searchNode(temp.right, value);
            }
        }
    }

    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);

        int z,x=1,c=1;
        while(x==1)
        {
            System.out.println("binary tree  OPERATIONS USING ARRAY\n1.insert\n2.search\n3.preorder\n4.inorder\n5.postorder");
            System.out.println("Enter your choice");
            z=sc.nextInt();
            switch(z)
            {
                case 1:System.out.println("'Enter a value to be insert:");
                    if(c==1){
                        int y;
                        c=0;
                        y=sc.nextInt();
                        root = new Node(y);
                        System.out.println("inorder:");
                        System.out.println(y);
                    }
                    else{

                        insert(root,sc.nextInt());
                        System.out.println("inorder:");
                        inorder(root);
                    }
                    break;
                case 2:System.out.println("enter element to search:");
                    flag=false;
                searchNode(root,sc.nextInt());
                if(flag==false){
                    System.out.println("Element not found");}
                inorder(root);
                break;
                case 3:preorder(root);
                break;
                case 4:inorder(root);
                    break;
                case 5:postorder(root);
                    break;
                case 6:x=0;
            }
        }
    }
}