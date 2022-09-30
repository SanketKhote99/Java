package Random;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name ");
        String userName = sc.nextLine();
        System.out.println("Hello "+userName);
    }
}
