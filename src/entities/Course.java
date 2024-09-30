package entities;
import java.util.ArrayList;
public class Course {
    private String name;
    private String c_code;
    private ArrayList<Section> sections; 

    public Course() {
        
    }

    public Course(String name, String c_code, ArrayList<Section> sections) {
        this.name = name;
        this.c_code = c_code;
        this.sections = sections;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getC_code() {
        return c_code;
    }

    public void setC_code(String c_code) {
        this.c_code = c_code;
    }

    public ArrayList<Section> getSections() {
        return sections;
    }

    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }
    
    
    
   
    
    
}
