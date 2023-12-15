/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week10lab;


public class BachelourStudent extends Student implements ProjectScoreBehaviour {
    
    public BachelourStudent(int id , float mid , float fin){
        super(id,mid,fin);
    }
    
    @Override
    float computeTotalScore(){
         System.out.println(" BachelourStudent ");
       return computeBaseScore()+projectScore();
    }
    
    @Override
    public  float  projectScore(){
        return 20f;
    }
}
