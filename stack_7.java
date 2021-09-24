import java.util.*;
class Stack_7
{
    Stack<Integer> s;
    int min;
    Stack_7() {
        s = new Stack<Integer>();
    }
    void getMin()
    {
        if (s.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Minimum Element in the " +
                    " stack is: " + min);
    }
    void peek()
    {
        if (s.isEmpty())
        {
            System.out.println("Stack is empty ");
            return;
        }
        int t = s.peek();
        System.out.print("Top Most Element is: ");
        if (t < min)
            System.out.println(min);
        else
            System.out.println(t);
    }
    void pop()
    {
        if (s.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Top Most Element Removed: ");
        Integer t = s.pop();
        if (t < min)
        {
            System.out.println(min);
            min = 2*min - t;
        }
        else
            System.out.println(t);
    }
    void push(Integer x)
    {
        if (s.isEmpty())
        {
            min = x;
            s.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }
        if (x < min)
        {
            s.push(2*x - min);
            min = x;
        }
        else
            s.push(x);
        System.out.println("Number Inserted: " + x);
    }
    public static void main(String[] args)
    {
        Stack_7 s = new Stack_7();
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();
    }
} ;