package Assignment;

public class StaticMV {

    // Static variables
    static int x = 10;
    static int y;

    // Static Method
    static void method() {
       System.out.println("x = " + x);
       System.out.println("y = " + y);
    }
    
    public static void main(String args[]) {
        method();
        }
 }