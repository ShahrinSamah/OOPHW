/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5;

/**
 *
 * @author Lenovo S540
 */
import java.util.Scanner;
public class LetterGrades
{
    public static void main(String[] args)
    {
        int total=0;
        int gradeCounter=0;
        int aCount=0;
        int bCount=0;
        int cCount=0;
        int dCount=0;
        int fCount=0;
        
        Scanner input=new Scanner(System.in);
        System.out.printf("%s%n%s%n %s%n %s%n",
        "Enter the integer grades int the range 0-100.",
             "Type the end-of-file indicator to terminate input: ",
             "On UNIX/LINUX/Mac OS X type <Ctrl> d then press Enter",
             "On Windows type <Ctrl> z then press Enter");                                                                                         
        while(input.hasNext())
        {
          int grade = input.nextInt(); 
          total += grade; 
          ++gradeCounter;

          switch(grade/10)
         {
          case 9, 10 -> ++aCount;
          case 8 -> ++bCount;
          case 7 -> ++cCount;
          case 6 -> ++dCount;
          default -> ++fCount; 
         }

        } 
 
        System.out.printf("%nGrade Report:%n");
        if (gradeCounter != 0)
     {
          double average = (double) total / gradeCounter;

          System.out.printf("Total of the %d grades entered is %d%n",
          gradeCounter, total);
          System.out.printf("Class average is %.2f%n", average);
          System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
             "Number of students who received each grade:",
             "A: ", aCount, 
             "B: ", bCount, 
             "C: ", cCount, 
             "D: ", dCount, 
             "F: ", fCount);
 } 
        else  
            System.out.println("No grades were entered");
 } 
} 