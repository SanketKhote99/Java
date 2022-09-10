package hw1;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Digit ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num + " Is Even");
        }
        else{
            System.out.println(num + " Is Odd");
        }
      }
    }
    