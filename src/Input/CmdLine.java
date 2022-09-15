package Input;

public class CmdLine {
    public static void main(String[] args) {
        {
            try {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                int c = Integer.parseInt(args[2]);
                
                System.out.println("Addition "+(a+b+c));
                System.out.println("Avg "+(a+b+c)/3);
                
            } catch (NumberFormatException e1) {
                
                System.out.println("Not a Number ");
            }
            
            catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("Bad Array Index ");
            }
        }
    }
    
}
