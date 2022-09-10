package hw1;

public class Ex4 {
    public static void main(String[] args) {
        int a = 22;
        int b = 55;
        int c = 66;
        if(a >= b && a >= c){
            System.out.println("Max num are "+a);
        }
        else if(b >= a && b >= c){
            System.out.println("Max num are "+b);
        }
        else{
            System.out.println("Max num are "+c);
        }
    }
}