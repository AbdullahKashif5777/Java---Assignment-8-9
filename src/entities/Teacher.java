package entities;
public class Teacher extends User{
    private int emp_code;
    private String dept;
    private double salary;

    public Teacher() {
    }

    public Teacher(String name, String u_name, String password, String security_q, String security_a, String role,int emp_code, String dept, double salary) {
        super(name, u_name, password, security_q, security_a, role);
        this.emp_code = emp_code;
        this.dept = dept;
        this.salary = salary;
    }

    public int getEmp_code() {
        return emp_code;
    }

    public void setEmp_code(int emp_code) {
        this.emp_code = emp_code;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
}
