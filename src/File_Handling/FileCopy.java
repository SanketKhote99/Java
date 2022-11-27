package File_Handling;
import java.io.*;
class FileCopy{
    public static void main(String[] args) throws IOException {
        FileInputStream fin = null ;
        FileOutputStream fout = null ;

        try{

            try {
               fin = new FileInputStream(
        "C:\\Users\\Sanket\\Desktop\\Study\\Java\\src\\File_Handling\\a.text"
        // args[0]
                );
            } catch (FileNotFoundException e1) {
                System.out.println("Error in source file ");
            }
            
            try {
                 fout = new FileOutputStream(
        "C:\\Users\\Sanket\\Desktop\\Study\\Java\\src\\File_Handling\\b.text"
        // args[1]
                );
            } catch (FileNotFoundException e2) {
                System.out.println("Error in destination file ");
                
            }
            }catch(ArrayIndexOutOfBoundsException e3){
                System.out.println("Bad array index ");
            }
            int c;

                while ((c = fin.read()) != -1) {
                    fout.write(c);
                }
                System.out.println(
                    "copied the file successfully");
            }
           
        }