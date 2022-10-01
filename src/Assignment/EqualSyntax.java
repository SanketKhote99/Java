package Assignment;

public class EqualSyntax {
    public static void main(String[] args) {
        String s1 = "message";
        String s2 = "Message";
        String s3 = "message";

        // Equal Method Syntax
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
