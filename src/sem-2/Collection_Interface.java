import java.util.*;

public class Collection_Interface {
  public static void main(String[] args) {
    List list_1 = new ArrayList();
    List<String> list_2 = new ArrayList<String>();
    list_1.add(10);
    list_1.add(20);
    list_2.add("BTech");
    list_2.add("Smart");
    list_2.add("Class");
    list_1.addAll(list_2);
    System.out.println("Elements of list_1: " + list_1);
    System.out.println("Search for BTech: " + list_1.contains("BTech"));
    System.out.println("Search for list_2 in list_1: " +
        list_1.containsAll(list_2));
    System.out.println("Check whether list_1 and list_2 are equal: " +
        list_1.equals(list_2));
    System.out.println("Check is list_1 empty: " + list_1.isEmpty());
    System.out.println("Size of list_1: " + list_1.size());
    System.out.println("Hashcode of list_1: " + list_1.hashCode());
    list_1.remove(0);
    System.out.println(list_1);
    list_1.retainAll(list_2);
    System.out.println(list_1);
    list_1.removeAll(list_2);
    System.out.println(list_1);
    list_2.clear();
    System.out.println(list_2);
  }
}