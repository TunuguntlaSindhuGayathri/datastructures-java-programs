import java.util.Scanner;
class main {
    private static int front, rear, capacity;
    private static int queue[];

    main(int c)
    {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    static void queueEnqueue(int data)
    {

        if (capacity == rear) {
            System.out.printf("\nQueue is full\n");
            return;
        }


        else {
            queue[rear] = data;
            rear++;
        }
        return;
    }


    static void queueDequeue()
    {

        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
            return;
        }


        else {
            System.out.printf("The deleted element is %d ", queue[0]);
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }


            if (rear < capacity)
                queue[rear] = 0;


            rear--;
        }
        return;
    }

    static void queueDisplay()
    {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }


        for (i = front; i < rear; i++) {
            System.out.printf(" %d  ", queue[i]);
        }
        return;
    }



}

public class Main {
    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the queue");
        int size;
        size=sc.nextInt();
       main q = new main(size);
        int z;
        int x=1;
        while(x==1)
        {
            System.out.println("QUEUE OPERATIONS USING ARRAY\n1.Enqueue\n2.DEQUE\n3.DISPLAY\n4.EXIT");
            System.out.println("Enter your choice");
            z=sc.nextInt();
            switch(z)
            {
                case 1:System.out.println("Enter a value to be pushed:");
                    q.queueEnqueue(sc.nextInt());
                    break;
                case 2:q.queueDequeue();
                    break;
                case 3:q.queueDisplay();
                    break;
                case 4:x=0;
            }
        }
    }
}
