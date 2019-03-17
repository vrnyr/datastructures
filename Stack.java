/*
VRNYR
 */

import java.util.Scanner;

public class Stack
{
    static int n;
    static int top=-1;
    static int a[];
    public static void main(String[] args)
    {
        System.out.println("Stack Implementation using Array");
        System.out.println("Enter the size of stack: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        while(true)
        {
            System.out.println("(1) PUSH");
            System.out.println("(2) POP");
            System.out.println("(3) TOP OF STACK");
            int c = sc.nextInt();
            switch (c)
            {
                case 1: Push();
                        break;
                case 2: Pop();
                        break;
                case 3: System.out.println("TOP OF STACK is "+Top());
                        break;
            }
        }
    }
    public static void Push()
    {
        if(top==n-1)
        {
            System.out.println("ERROR: STACK IS FULL. OVERFLOW!");
            return;
        }
        else
        {
            System.out.println("Enter a element to push: ");
            Scanner sc = new Scanner(System.in);
            int e = sc.nextInt();
            top++;
            a[top]= e;
        }
    }
    public static void Pop()
    {
        if(top==-1)
        {
            System.out.println("ERROR: STACK IS EMPTY. UNDERFLOW!");
            return;
        }
        else
        {
            top--;
        }
    }
    public static int Top()
    {
        if(top==-1)
        {
            return 0;
        }
        else
        {
            return a[top];
        }
    }
}