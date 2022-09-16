package Input;
import java.io.*;
public class BufferedReaderDouble {
    public static void main(String[] args) 
    throws Exception{
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter 1st no ");
            double a = Double.parseDouble(br.readLine());
            System.out.println("Enter 2st no ");
            double b = Double.parseDouble(br.readLine());
            System.out.println("Product of "+a+" and "+ b +" are "+(a*b));
        }
        catch(NumberFormatException e1){
            System.out.println("Not a number ");
        }
    }
    
}