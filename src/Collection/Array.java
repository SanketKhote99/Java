package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(45);
        marks.add(55);
        marks.add(33);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
    }    
}
