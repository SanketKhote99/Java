package hw2;

import java.util.ArrayList;
import java.util.Collections;

public class Array1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);

        System.out.println(number);
        Collections.reverse(number);
        System.out.println(number);
    }
    
}
