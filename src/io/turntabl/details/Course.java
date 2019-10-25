package io.turntabl.details;

import java.util.List;

public class Course {

    //DECLARATION OF VARIABLES
    private Lecturer lecturer;
    private List<Student> student;
    private CourseYear courseYear;


    //CONSTRUCTORS FOR VARIABLES

    public Course(Lecturer lecturer, List<Student> student, CourseYear courseYear) {
        this.lecturer = lecturer;
        this.student = student;
        this.courseYear = courseYear;
    }


    //GETTERS FOR VARIABLES

    public Lecturer getLecturer() {
        return lecturer;
    }

    public List<Student> getStudent() {
        return student;
    }

    public CourseYear getCourseYear() {
        return courseYear;
    }


    //FORMATTING OF VARIABLES


    @Override
    public String toString() {
        return "Course{" +
                "lecturer=" + lecturer +
                ", student=" + student +
                ", courseYear=" + courseYear +
                '}';
    }
}
