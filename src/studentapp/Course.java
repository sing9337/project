/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentapp;

/**
 *
 * @author RAMAN
*/
import java.util.Scanner;

public class Course 
{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;
    
    public Course(String courseName)
    {
        
    }
    
    public String getCourseName()
    {
        return courseName;
    }
    
    public void addStudent(String student)
    {
        for(int i=numberOfStudents; i<100; i++)
        {
            students[i] = student;
        }
    }
    
    public void dropStudent(String student)
    {
        for(int i=index, i<numberOfStudents, i++)
        {
            
        }
    }
    
    public String[] getStudents()
    {
        return students;
    }
    
    public int getNumberOfStudents()
    {
        return numberOfStudents;
    }
}
