import java.util.ArrayList;
import java.util.Scanner;

public class Cities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> cities = new ArrayList<>();

        System.out.print("Enter the number of cities: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of city :" + (i + 1) + ": ");
            String city = input.nextLine();
            cities.add(city);
        }

        System.out.println("Cities in the ArrayList:");
        for (String city : cities) {
            System.out.println(city);
        }

        cities.clear();

        System.out.println("Cities after clearing the ArrayList:");
        for (String city : cities) {
            System.out.println(city); 
        }
    }
}
