// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    Scanner scan = new Scanner(System.in);
    private String name;
    private double test1;
    private double test2;
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        //add body of constructor
        this.name = studentName;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        //add body of inputGrades
        System.out.println("Input the first test grade of " + this.name);
        this.test1 = scan.nextDouble();
        System.out.println("Input the second test grade of " + this.name);
        this.test2 = scan.nextDouble();
    }
    //getAverage: compute and return the student's test average
    public double getAverage(){
        return (this.test1 + this.test2)*0.5;
    }
    //getName: return the student's name
    public String getName()
    {
        return this.name;
    }
    //printName: print the student's name
    public void printName()
    {
        System.out.println(this.name);
    }
    
    public String toString(){
        return ("Name:" + this.name + " Test1: " + this.test1 + " Test2: " + this.test2);
    }
}