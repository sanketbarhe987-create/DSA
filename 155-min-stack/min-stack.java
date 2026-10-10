public class Node{
    int val;
    int min;

    Node(int v,int m)
    {
        this.val=v;
        this.min=m;
    }
}

class MinStack {

    Stack<Node> stack;

    public MinStack() {
        stack=new Stack<Node>();
    }
    
    public void push(int value) {
        if(stack.isEmpty())
        {
          stack.push(new Node(value,value));
          return;
        }

        Node nodeTop=stack.peek(); 
        int minTop=nodeTop.min;

        if(value<minTop)
        {
             stack.push(new Node(value,value));
        }
        else
        {
             stack.push(new Node(value,minTop));
        }
    }
 
    public void pop() {
        if(stack.isEmpty())
        {
            return;
        }
        stack.pop();
    }
    
    public int top() {
        if(stack.isEmpty())
        {
            return -1;
        }
       

        Node nodeTop=stack.peek();
        return nodeTop.val;
       
    }
    
    public int getMin() {
         if(stack.isEmpty())
        {
            return -1;
        }
        Node nodeTop=stack.peek();
        return nodeTop.min;
    }
}

