package Assignment;

    class Data {
    int id;
    String name;
    Data(int id, String name){
        this.id = id;
        this.name = name;

}
    void display(){
            System.out.println(id + " " + name);
        }
   
}

class This{
    public static void main(String[] args) {
        Data d1 = new Data(00, "null");
        d1.display();
    }
}