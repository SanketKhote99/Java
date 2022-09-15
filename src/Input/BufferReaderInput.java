package Input;

import java.io.*;
public class BufferReaderInput {
    public static void main(String[] args)
        throws IOException
        {
            try{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter 1st no ");
                int a = Integer.parseInt(br.readLine());
                System.out.println("Enter 2st no ");
                int b = Integer.parseInt(br.readLine());
                System.out.println("Addition "+(a+b));
            }
            catch(NumberFormatException e1){
                System.out.println("Not a number ");
            }
    }
    
}
