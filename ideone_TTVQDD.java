/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;



class MinStack {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MinStack() {
       s1 = new Stack<>();
       s2 = new Stack<>();
    }
    
    public void push(int val) {
       s1.push(val);
       if( s2.empty() || (!s2.empty() && s2.peek() >= val))
       {
           s2.push(val);
       }
    }
    
    public void pop() {
        int val = s1.pop();
        if(!(s2.empty()) && val == s2.peek()){
            s2.pop();
        }
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return s2.peek();
    }
}



/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{   
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	}
}