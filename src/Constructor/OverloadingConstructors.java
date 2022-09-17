package Constructor;

public class OverloadingConstructors {
    String name,clgname,address;
    int id;

    OverloadingConstructors(String clgname, String address, String name, int id){
        this.name=name;
        this.id=id;
        this.clgname=clgname;
        this.address=address;
    }
    OverloadingConstructors(String name,int id){
        this.clgname="SCSM";
        this.address="Shrigonda, A.nagae 413701";
        this.name=name;
        this.id=id;



        System.out.println("Student Info");
        System.out.println("Name = "+name);
        System.out.println("Id = "+id);
        System.out.println("College Name = "+clgname);
        System.out.println("Address = "+address+"\n");
    }
    public static void main(String[] args) {
        new OverloadingConstructors("Sanket",01);
        new OverloadingConstructors("Aniket",02);
    }
    
}
