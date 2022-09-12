package Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Linked{
    public static void main(String[] args) {
        LinkedList<Integer> marks = new LinkedList<>();
        marks.add(36);
        marks.add(56);
        marks.add(26);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
    }
}