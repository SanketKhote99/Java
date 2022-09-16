package Objects_and_Classes;

    class Boxdata{
    double l,b,h;

    public void Setdata(double x, double y, double z){
        l = x;
        b = y;
        h = z;
    }

    public void Showdata(){
        System.out.println("Length = "+l);
        System.out.println("Breath "+b);
        System.out.println("Height = "+h);
    }
    double Volume(){
        return(l*b*h);
    }
}
public class Box{
    public static void main(String[] args) {
        Boxdata b1 = new Boxdata();
        b1.Setdata(12, 13, 14);
        b1.Showdata();
        double al = b1.Volume();
        System.out.println("Volume of box = "+al+"\n");


        Boxdata b2 = new Boxdata();
        b2.Setdata(22, 33, 44);
        b2.Showdata();
        double a2 = b2.Volume();
        System.out.println("Volume of box = "+a2+"\n");
        
    }
}