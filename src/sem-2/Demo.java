import java.lang.*;
 class Cons extends Thread
 {
 Cons()
 {
 start(); 
 }
 public void run()
 {
 try
 {
 for (int k=1;k<=5;++k)
 {
 System.out.println("mythread" + k);
 Thread.sleep(500);
 }
 }
 catch(InterruptedException ob)
 {
 }
 System.out.println("Thread exists");
 } 
 }  
 class Demo
 {
 public static void main(String args[])
 {
 Cons c = new Cons();
 try
 {
 for (int i=1;i<=5;++i)
 {
 System.out.println("Main Thread" +i);
 Thread.sleep(1000);
 } 
 } 
 catch (InterruptedException ob)
 {
 }
 System.out.println("main Thread Exists");
 } 
} 