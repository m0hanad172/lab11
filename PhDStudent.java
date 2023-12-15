/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week10lab;


public class PhDStudent extends MasterStudent implements ArticleScoreBehaviour{
    
    int numberOfArticles;
    
    public PhDStudent(int id, float mid , float fin , int conf,int numberOfArticles ){
        super(id,mid,fin,conf);
        this.numberOfArticles=numberOfArticles;
    }
    
    @Override
    float computeTotalScore(){
        
        System.out.println("PHDStudent ");
       
        return computeBaseScore()+articleScore();
    }
    
    @Override
    public float articleScore(){
        
        return numberOfArticles*8f ;
    }
}
