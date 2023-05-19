import java.util.Hashtable;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hashtable<Long, String> contactList = new Hashtable<Long, String>();

        System.out.print("Enter the number of contacts: ");
        int n = input.nextInt();

        System.out.println("Enter the mobile number and name of the student:");

        for (int i = 0; i < n; i++) {
            System.out.print("Mobile Number: ");
            Long mobileNumber = input.nextLong();
            input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
            contactList.put(mobileNumber, name);
        }

        System.out.println("\nContact List:");

        for (Long mobileNumber : contactList.keySet()) {
            String name = contactList.get(mobileNumber);
            System.out.println("Mobile Number: " + mobileNumber + ", Name: " + name);
        }

        input.close();
    }
}
