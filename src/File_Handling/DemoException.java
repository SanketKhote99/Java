package File_Handling;
class DemoException{
     static void compute(Double a,Double b)throws ArithmeticException{
        double c = a/b;
        if(c<1)
        throw new ArithmeticException("Value less thean 1");
        System.out.println("Result = "+c);
     }
     public static void main(String[] args) {
        try
        {
            compute(10.0, 2.0);
            compute(5.0, 60.0);
            compute(5.0, 100.0);
        }
        catch (ArithmeticException e1){
            System.out.println("Exception is catch");
        }
     }
}