package OOPs.Encapsulation;

// Default Access Modifier
// class Student{
//     String name;
//     int reg_no;
// }

// Private Access Modifier
class Student{
    private String name;
    private int reg_no;
    private String password;
    void set(String name, int reg_no){
        this.name = name;
        this.reg_no = reg_no;
    }
    private void setPassword(String password){
        this.password = password;
    }
    void setLoginDetails(String username, String password){
        setPassword(password);
        name = username;
    }
    String getName(){
        return name;
    }
    int getRegNo(){
        return reg_no;
    }

    String getPassword(){
        return password;
    }
}


public class AccessModifiers {
    public static void main(String[] args) {
        Student s1 = new Student();
        // System.out.println(s1.name+" "+s1.reg_no);
        s1.set("Saran",2345);
        System.out.println(s1.getName()+" "+s1.getRegNo());
        s1.setLoginDetails("Maran","Maran@123");
        System.out.println(s1.getPassword());
    }
}
