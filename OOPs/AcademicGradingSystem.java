package OOPs;

class Course{
    String course_name;
    String course_code;
    void GradingStragies(){
        System.out.println("Student name : ");
        System.out.println("Reg no : ");
        System.out.println("Grading Stragy : ");
    }
}
class TheoryCourse extends Course{
    int int_mark;
    int ext_mark;
    @Override
    void GradingStragies(String name, String reg_no, int int_mark, int ext_mark){
        System.out.println("Student name : "+ name);
        System.out.println("Reg no : "+ reg_no);
        System.out.println("Grading Stragy : "+ (int_mark+ext_mark)/2);
    }
}

class Labcourse extends Course{
    float performance_score;
    float attendace;
}

public class AcademicGradingSystem {
    
}
