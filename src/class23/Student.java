package class23;

import java.util.SortedMap;

public class Student {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism


     */
    public void goToSchool(){
        System.out.println("Student go to school");

    }
    public void passExam(){
        System.out.println("Student pass the exam ");

    }
}
 class SyntaxStudent extends Student {
     @Override
     public void goToSchool() {
         System.out.println("Syntax student take online class");
     }

     @Override
     public void passExam() {
         System.out.println("Student doesn't have to pass exam");
     }
 }
 class CollegeStudent extends Student{

     @Override
     public void goToSchool() {
         System.out.println("College student goes to school");
     }

     @Override
     public void passExam() {
         System.out.println("College students have to pass exams");
     }
 }
 class SchoolStudent extends Student{

     @Override
     public void goToSchool() {
         System.out.println("Student goes to school");
     }

     @Override
     public void passExam() {
         System.out.println("Students have to pass exam");
     }
 }
