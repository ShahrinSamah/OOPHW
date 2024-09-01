/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter7;

/**
 *
 * @author Lenovo S540
 */
public class GradeBookTest2 {
    public static void main(String[] args) {
        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        GradeBook2 myGradeBook = new GradeBook2(
                "CS101 Introduction to Java Programming",gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n",
                myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }

}
    

