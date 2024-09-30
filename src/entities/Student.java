package entities;
public class Student extends User{//inherit with user
    private String program;//BSSE,BSCS,BSIT,BSAI

    public Student(String name, String u_name, String password, String security_q, String security_a, String role,String program) {
        super(name, u_name, password, security_q, security_a, role);
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
       
}
