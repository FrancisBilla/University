package io.turntabl;


import io.turntabl.details.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> studentsList = Arrays.asList(
                new Student("Edward Mensah", 9874545, Level.FOURTH),
                new Student("Sam Berny", 42246545, Level.SECOND),
                new Student("Shadrack Ntim", 2154656, Level.FOURTH),
                new Student("Dennis Effa", 75465424, Level.THIRD),
                new Student("Frank Agyei", 21365487, Level.FOURTH),
                new Student("Elizabeth Okyere", 14524542, Level.FIRST),
                new Student("Malisa Oteng", 74561321, Level.SECOND),
                new Student("Stephen", 464545181, Level.FIRST),
                new Student("John Ansah", 46521325, Level.THIRD)

        );



        Lecturer lecturer1 = new Lecturer("Sam Moorhouse", Subject.PROGRAMMING);
        Lecturer lecturer2 = new Lecturer("Francis Billa", Subject.MATHS);
        Lecturer lecturer3 = new Lecturer("Patricial", Subject.ENGLISH);
        Lecturer lecturer4 = new Lecturer("Alexander Owusu", Subject.GARDENING);
        Lecturer lecturer5 = new Lecturer("Shadrack Ohene", Subject.PHYSICS);


        //CREATING INTRO TO PROGRAMMING COURSE

        List<Student> firstYearStudents = new ArrayList<>();
        for(Student student: studentsList){
            if(student.getCurrentLevel() == Level.FIRST){
                firstYearStudents.add(student);
            }

        }

        Course introProgramming = new Course(lecturer1, firstYearStudents, CourseYear.First);

        System.out.println(firstYearStudents);



        List<Student> doubleYearStudents = new ArrayList<>();
        for(Student student: studentsList){
            if(student.getCurrentLevel() == Level.THIRD || student.getCurrentLevel() ==Level.FOURTH){
                doubleYearStudents.add(student);
            }
        }

        Course advancedGardening = new Course(lecturer3, doubleYearStudents, CourseYear.Third_Fourth);


        List<Student> vowelStudentsName = studentsList
                .stream()
                .filter(stu -> stu.getName().startsWith("A")||
                                stu.getName().startsWith("E") ||
                                stu.getName().startsWith("O") ||
                                stu.getName().startsWith("U"))
                .collect(Collectors.toList());

        System.out.println(vowelStudentsName);
        vowelStudentsName.forEach(stu -> System.out.println(stu.getName()));






    }




}
