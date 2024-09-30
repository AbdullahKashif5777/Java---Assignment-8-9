package entities;

public class Enrollment {
    private Student std;
    private Course course;

    public Enrollment() {
        
    }

    public Enrollment(Student std, Course course) {
        this.std = std;
        this.course = course;        
    }
        
    public Student getStd() {
        return std;
    }

    public void setStd(Student std) {
        this.std = std;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    
}
