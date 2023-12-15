/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week10lab;


public class Week10Lab {

    public static void main(String[] args) {
       
      Student s1=new BachelourStudent(2223503, 70, 80);
      Student s2=new MasterStudent(22223508, 70, 50, 5);
      Student s3= new PhDStudent(22223504, 46, 70, 10, 4);
      
      Student [] students=new Student []{s1,s2,s3};
      
      for(Student e:students){
          System.out.println(" baseScore "+e.computeBaseScore()+" totalScore "+e.computeTotalScore());
      }
      
        
        
        
        
    }
}
