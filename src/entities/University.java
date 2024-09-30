package entities;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class University {
    private static ArrayList<Course>courses;
    private static ArrayList<User> users;//Runtime polymorphism
    //private static ArrayList<Student> students;
    //private static ArrayList<Teacher> teachers;
    private static ArrayList<Enrollment> enrollments;
    private static ArrayList<WorkLoad> workLoads;
    
    static{
        courses = new ArrayList();
        users = new ArrayList();
        enrollments = new ArrayList();
        workLoads = new ArrayList();
    }
    
    public static void dummyUsers(){
        //up-casting
        users.add(new User("Bilal Arif","bilal93","1122","Your First Teacher Name?","mudasir","Admin"));
        users.add(new Student("Ali Ahmad","Ali99","9110","Your First Pet Name?","ZOZO","Student","BSSE"));
        users.add(new Student("Junaid","JD55","4455","Your First Teacher Name?","zubair","Student","BSCS"));
        users.add(new Teacher("Raybal Akhtar","raybal88","7788","Your First Teacher Name?","Adnan","Teacher",12644,"CS",30000));
        users.add(new Teacher("Abdullah Yousaf","Abdullah44","4433","Your First Teacher Name?","Amjad","Teacher",14456,"IT",40000));
        
    }
    
    public static ArrayList<Student> getStudents(){
        ArrayList<Student> students = new ArrayList();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getRole().equalsIgnoreCase("student")) {
                students.add((Student)users.get(i));                
            }
        }
        return students;
    }
    
    public static ArrayList<Teacher> getTeachers(){
        ArrayList<Teacher> teachers = new ArrayList();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getRole().equalsIgnoreCase("teacher")) {
                teachers.add((Teacher)users.get(i));                
            }
        }
        return teachers;
    }
    
    
    public static void dialogeMsg(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static boolean registerUser(User u){//signup
        if (u!=null) {
            users.add(u);
            return true;
        }            
        else{
            return false;
        }
    }
    public static String verifyUser(String u_name,String pass){//login
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getU_name().equals(u_name)&&
                pass.equals(users.get(i).getPassword())) {
                return users.get(i).getRole();
                
            }
        }
        return null;
    }
    public static boolean createCourse(Course c){
        if (c!=null) {
            courses.add(c);
            return true;
        }
        else
            return false;
    }   
    
}
