/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week10lab;

/**
 *
 * @author USER
 */
public  abstract  class Student {
    private int id;
    private float mid ;
    private float fin ;
    
    public Student (int id , float mid , float fin){
        this.id= id ;
        this.mid= mid ;
        this.fin=fin;
    }
    
    abstract float computeTotalScore();
    
     float computeBaseScore(){
        return this.mid*0.4f+ this.fin*0.6f ;
    }
    
}
