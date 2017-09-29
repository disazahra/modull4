/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author Daraprwtsr
 */
public class Triangle extends Shape{
    //Private member variables 
    private int base;
    private int height;
    //constructor
    public Triangle (String color, int bae, int height){
        super(color);
        this.base=base;
        this.height=height;
    }
    @Override
    public double getArea(){
        return 0.5*base*height;
    }
    
}
