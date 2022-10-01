package Assignment.College;
public class StudentInfo{
    int roll_no;
    String name;
    String student_class;
    double percentage;

    public void Displayinfo(){
        
        System.out.println("Student Roll no:- 01");
        System.out.println("Student Name:- Sanket");
        System.out.println("Class:- BCS");
        System.out.println("Percentage:- 90");

    }
}

class StudentPercentage{
    int roll_no;
    String name;
    String student_class;
    double java;
    double python;
    double webtechnique;

    public void Percentage(int roll_no,String name,String student_class,double java,double python,double webtechnique){
        
        System.out.println("\nStudent Roll no:- "+roll_no);
        System.out.println("Student Name:- "+name);
        System.out.println("Class:- "+student_class);
        System.out.println("Percentage:- "+(java+python+webtechnique)/3+"%");
    }
}