package practice;
public class Practice{
    private int number;
    public int getData(){
        return this.number;
    }
    public void setData(int number){
        this.number=number;
    }
}
class Main{
    public static void main(String[] args) {
        Practice num = new Practice();
        num.setData(99);
        System.out.println("Number is "+num.getData());
    }
}