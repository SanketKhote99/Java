package Random;
class Box{
    float l,b,h;
    Box(){
        
    }
   void Box(float l,float b,float h){
        System.out.println("Volume of box "+(l*b*h));
    }
}


class Inheritance extends Box{
   void Box(float l,float b,float h){
        System.out.println("Weight of box "+(l*b*h)/5000 +" kg");
    }
    public static void main(String[] args) {
        Box b = new Box();
        Box a = new Inheritance();
        b.Box(2, 3, 4);
        a.Box(50, 20, 30);
    }
}