package Student;
public class Demo {

    public static void main(String[] args) {
        // StudentData st1;
        // st1 = new StudentData();
        // st1.StudentId =123;
        // st1.StudentName = "Sanket";
        // st1.StudentClass = "TY.BCS";
        // st1.PJ = "Java";

        // StudentData st2;
        // st2 = new StudentData();
        // st2.StudentName = "Aniket";
        // st2.PJ = "Python";
        
        StudentData st1 = new StudentData(12,"Sanket","BCS", "php");
        st1.Project();
        st1.StudentFullDetails();
        
        // st2.Project();
        // st2.StudentFullDetails();
}


    
}
