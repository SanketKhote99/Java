package Student;


public class StudentData{
    int StudentId;
    String StudentName;
    String StudentClass;
    String PJ;

    public void Project(){
        System.out.println(PJ+" Project for "+StudentName);
    }

    public void StudentFullDetails(){
        System.out.println("Student Id "+StudentId);
        System.out.println("Student Name "+StudentName);
       System.out.println("Student Class "+StudentClass);

    }
public StudentData(int i, String n, String c, String p){
    StudentId = i;
    StudentName = n;
    StudentClass = c; 
    PJ = p; 
}


}