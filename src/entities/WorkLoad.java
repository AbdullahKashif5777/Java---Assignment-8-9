package entities;

public class WorkLoad {
    private Teacher teacher;
    private Course course;

    public WorkLoad() {
    }

    public WorkLoad(Teacher teacher, Course course) {
        this.teacher = teacher;
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    
}
