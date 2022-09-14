package hw2;

public class CmdLineFloat {
    public static void main(String[] args) {
        {
            try {
                Float a = Float.parseFloat(args[0]);
                Float b = Float.parseFloat(args[1]);
                
                System.out.println("Addition "+a+b);
                System.out.println("Avg"+(a+b)/2);
                
            }
             catch (NumberFormatException e1) {
                
                System.out.println("Not a Number ");
            }
            
            catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("Bad Array Index ");
            }
        }
    }
}
