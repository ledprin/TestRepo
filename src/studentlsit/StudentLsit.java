/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlsit;

/**
 *
 * @author Leste
 */

public class StudentLsit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Print Student Information
        
        Student[] list = new Student[3];
        Student s1 = new Student(); //s1 is an Object
        s1.setName("Peter");
        s1.setSid(1);
        
        //Note long way to insert objects in array
        list[0] = s1;
        
        //Because I made I constructor in the Student class
        //We can skip the long way and just declare
        //The variables in the Student class 
        
        Student s2 = new Student("John",2);
        Student s3 = new Student("Simon",3);
        list[1] = s2;
        list[2] = s3;
        
        for(int i=0; i<list.length; i++){
            System.out.println(list[i].getName()+" "+list[i].getSid());
        }
        
        
        
    }
    
}
