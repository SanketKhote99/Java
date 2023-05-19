import java.util.*;
class DemoStack
{
 public static void main(String args[])
 {
 Stack stack1 = new Stack();
 try
 {
 stack1.push(new Integer(0));
 stack1.push(new Integer(1));
 stack1.push(new Integer(2));
 stack1.push(new Integer(3));
 stack1.push(new Integer(4));
 stack1.push(new Integer(5));
 stack1.push(new Integer(6));
 System.out.println("Pop->"+(Integer) stack1.pop());
 System.out.println("Pop->"+(Integer) stack1.pop()); 
 System.out.println("Pop->"+(Integer) stack1.pop());
 System.out.println("Pop->"+(Integer) stack1.pop());
 System.out.println("Pop->"+(Integer) stack1.pop());
 System.out.println("Pop->"+(Integer) stack1.pop());
 System.out.println("Pop->"+(Integer) stack1.pop());
 }
 catch (EmptyStackException e) {}
 }
 } 
