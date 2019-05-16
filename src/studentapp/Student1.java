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
public class Student1 
{
    String name;
    int age;
    
    Student(){}
    
    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    public void print()
    {
        System.out.println(name+" "+age);
    }
}
