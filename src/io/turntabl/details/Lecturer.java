package io.turntabl.details;

public class Lecturer {

    //DECLARATION OF VARIABLES
    private String name;
    private Subject subject;


    //CONSTRUCTORS FOR VARIABLES
    public Lecturer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    //GETTER FOR VARIABLES

    public String getName() {
        return name;
    }

    public Subject getSubject() {
        return subject;
    }


    //FORMATTING OF VARIABLES


    @Override
    public String toString() {
        return "Lecturers{" +
                "name='" + name + '\'' +
                ", subject=" + subject +
                '}';
    }


}
