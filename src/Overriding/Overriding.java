package Overriding;
public class Overriding {
    public void Bike(){
        System.out.println("TVS Starcity ");
    }
}

 class Aniket extends Overriding{
    public void Bike(){
    System.out.println("Mt-15 v2");

    }
    public static void main(String[] args) {
        Overriding bike = new Aniket();
        bike.Bike();
    }
}