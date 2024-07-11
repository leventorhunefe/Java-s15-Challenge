package library.enums;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public enum Course {
    CS("Computer Science", 1),
    ECO("Economics", 2),
    MATH("Mathematics", 3),
    PHY("Physics",4),
    PSY("Psychology", 5),
    SOC("Sociology",6);

    private String courseName;
    private int courseCode;

    Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    private static Set<Course> courses = new HashSet<>(Arrays.asList(Course.values()));

    public static void addCourse(String courseName){
        courses.add(Course.valueOf(courseName.toUpperCase()));
    }

    public static Set<Course> getCourses(){
        return courses;
    }

    // Getter & Setter

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }
}
