package Random;
import java.text.NumberFormat;
public class NumberFormatt {
    public static void main(String[] args) {
        
        //Currency Format
        NumberFormat n =  NumberFormat.getCurrencyInstance();
        String result = n.format(1234567.89);
        System.out.println(result);

        //Percent Format
        String result2 = NumberFormat.getPercentInstance().format(82.67);
        System.out.println(result2);
    }
    
}
