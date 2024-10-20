package SchoolDatabase;

import java.time.Year;
//Information about a specific course and who is the responsible teacher
public class DesignatedCourse {
    private Course course;
    private boolean responsible = false;
    private int year = 0;
    
    public DesignatedCourse(){

    }
    public DesignatedCourse(Course course, boolean resp, int year){
        setCourse(course);
        setResponsible(resp);
        setYear(year);
    }

    public Course getCourse(){
        return course;
    }
    public void setCourse(Course course){
        if (course != null) {
            this.course = course;
        }
    }
    public boolean isResponsible(){
        return responsible;
    }
    public void setResponsible(boolean responsible){
        this.responsible = responsible;
    }
    public boolean getResponsible(){
        return responsible;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        if (year >= 2000 && year <= (Year.now().getValue() + 1 )) {
            this.year = year;
        }
    }
    @Override
    public String toString(){
        String courseInfo = course.toString();
        return "[course=" + courseInfo + ", year=" + year + "]";
    }
}
