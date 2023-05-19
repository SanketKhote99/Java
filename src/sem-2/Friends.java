import java.util.Scanner;
import java.util.LinkedList;

public class Friends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of friends: ");
        int n = input.nextInt();

        LinkedList<String> friendList = new LinkedList<String>();

        System.out.println("Enter the names of your friends:");

        for (int i = 0; i < n; i++) {
            String name = input.next();
            friendList.add(name);
        }

        System.out.println("Your friend list:");

        for (String friend : friendList) {
            System.out.println(friend);
        }

        input.close();
    }
}
