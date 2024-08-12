package com.wipro;
import java.util.Scanner;
class Student 
{
     int registerNo;
     String studentName;
     int marks[]=new int[5];
     int sum;
     String grade;
     int avg;

    Student(int regNo,String studentName) 
    {
        this.registerNo=regNo;
        this.studentName=studentName;
    }
    void getMarks() 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");
        for (int i=0;i<marks.length;i++) 
        {
            marks[i]=s.nextInt();
        }
    }
    void calculateGrade()
    {
        sum=0;
        for(int mark:marks) 
        {
            sum+=mark;
        }
        avg=sum/marks.length;
        if(avg>=90) 
        {
            grade = "Grade O";
        } 
        else if (avg >= 80)
        {
            grade = "Grade A+";
        } 
        else if (avg >= 70) 
        {
            grade = "Grade A";
        }
        else if (avg >= 60) 
        {
            grade = "Grade B+";
        } 
        else if (avg >= 50)
        {
            grade = "Grade B";
        } 
        else 
        {
            grade = "Grade C";
        }
    }

    void displayDetails() 
    {
        System.out.println("Student Name: " + studentName);
        System.out.println("Register No: " + registerNo);
        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: " + grade);
    }
}

public class Student_Grade_Calculation 
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter student register number: ");
        int regNo = s.nextInt();
        s.nextLine(); 
        System.out.print("Enter student name: ");
        String name = s.nextLine();
        Student student = new Student(regNo, name);
        student.getMarks();
        student.calculateGrade();
        student.displayDetails();
    }
}
