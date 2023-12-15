/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week10lab;

/**
 *
 * @author USER
 */
public class MasterStudent extends Student implements ConferenceScoreBehaviour  {
    
    protected int numberOfConf ;
    
    public MasterStudent(int id , float mid , float fin , int numberOfConf){
        super(id,mid,fin);
        this.numberOfConf=numberOfConf;
    }
    @Override
    float computeTotalScore(){
          System.out.println(" MasterStudent ");
        return computeBaseScore()+conferenceScore();
    }
    
    @Override
    public float conferenceScore(){
        
        return numberOfConf*5f ;
    }
    
}
