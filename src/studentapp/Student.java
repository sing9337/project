/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 SHERIDAN COLLEGE
 */
package studentapp;

/**
 *
 * @author RAMAN
 */
import java.util.Scanner;

class Student 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Student[] students = new Student[3];
        
        for(int i=0; i<students.length; i++)
        {
            String name = input.next();
            int age = input.nextInt();
            students[i] = new Student(name, age);
        }
        
        for(int i=0; i<students.length; i++)
        {
            students[i].print();
        }
    }
}
