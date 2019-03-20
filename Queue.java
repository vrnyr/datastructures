import java.util.*;



public class Queue
{
    static int front, rear;
    static int[] queue;
    public static void main(String[] args)
    {
        System.out.println("Enter the size of queue");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        queue = new int[n];
        front=-1; rear=-1;
        while(true)
        {
            System.out.println("(1)Enque");
            System.out.println("(2)Deque");
            System.out.println("(3) Peek");
            int p = sc.nextInt();
            switch(p)
            {
                case 1: int s = sc.nextInt();
                        Enque(s);
                        break;
                case 2: Deque();
                        break;
                case 3: System.out.println(peek());
                        break;
                case 4: display();
                        break;
            }
        }

    }
    public static void display()
    {
        int k=front; int l=rear;
        while(k<=l)
        {
            System.out.print(queue[k]+" ");
            k++;
        }
    }
    public static boolean isEmpty()
    {
        if(front==-1&&rear==-1) return true;
        else return false;
    }
    public static int peek()
    {
        if(front!=-1&&rear!=-1) return queue[rear];
        else return -1;
    }
    public static void Enque(int x)
    {
        if(isEmpty())
        {
            front++;
            rear++;
            queue[rear]=x;
            System.out.println(x+" enqueued.");
        }
        else if(rear==queue.length-1) System.out.println("Queue is full!");
        else
        {
            queue[++rear]=x;
            System.out.println(x+" enqueued.");
        }
    }
    public static void Deque()
    {
        if(isEmpty()) System.out.println("Queue is empty!.");
        else if (front==rear)
        {
            System.out.println(queue[front]+" dequeued.");
            front=-1;
            rear=-1;
        }
        else
        {
            System.out.println(queue[front]+" dequeued.");
            front++;
        }
    }
}
