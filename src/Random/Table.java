package Random;
import java.util.Scanner;
public class Table  
{  
public static void main( String args[] )   
{
    int j = 1;
    System.out.println("Enter Any Number");
    Scanner sc = new Scanner(System.in);
    Integer a = sc.nextInt();
    while(j<=10){
        System.out.println( a+"*"+j+ " = " +j*a);
        j++;
    }
} 
}

