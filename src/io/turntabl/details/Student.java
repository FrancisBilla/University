package io.turntabl.details;

public class Student {

    //DECLARATION OF VARIABLES
    private String name;
    private int studentID;
    private  Level currentLevel;


    //CONSTRUCTORS FOR VARIABLES
    public Student(String name, int studentID, Level currentLevel) {
        this.name = name;
        this.studentID = studentID;
        this.currentLevel = currentLevel;
    }


    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public Level getCurrentLevel() {
        return currentLevel;
    }

    //FORMATTING


    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", currentLevel=" + currentLevel +
                '}';
    }






}
