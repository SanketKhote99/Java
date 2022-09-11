package Study;
public class AccessPrivateFields{
    private String name;
    public String getName(){
        return this.name;
        
    }
    public void setName(String name){
        this.name = name;
    }
}
class main{
    public static void main(String[] args) {
        AccessPrivateFields Data = new AccessPrivateFields();
        Data.setName("Sanket Khote");
        System.out.println(Data.getName());
    }
}