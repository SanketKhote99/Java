import java.util.TreeSet;

public class Colors {
    public static void main(String[] args) {
        TreeSet<String> colorSet = new TreeSet<String>();

        colorSet.add("red");
        colorSet.add("green");
        colorSet.add("blue");
        colorSet.add("yellow");
        colorSet.add("orange");

        System.out.println("Colors in the TreeSet are: " + colorSet);
    }
}
