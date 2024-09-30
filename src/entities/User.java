package entities;
public class User {
    private String name;
    private String u_name;
    private String password;   
    private String security_q;
    private String security_a;
    private String role;

    public User() {
    }

    public User(String name, String u_name, String password, String security_q, String security_a, String role) {
        this.name = name;
        this.u_name = u_name;
        this.password = password;
        this.security_q = security_q;
        this.security_a = security_a;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecurity_q() {
        return security_q;
    }

    public void setSecurity_q(String security_q) {
        this.security_q = security_q;
    }

    public String getSecurity_a() {
        return security_a;
    }

    public void setSecurity_a(String security_a) {
        this.security_a = security_a;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
}
