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
public class Shape {
    //Private member variable
    private String color;
    //Constructor
    public Shape (String color){
        this.color = color;
    }
    @Override
    public String toString(){
        return "Shape[color=" + color + "]";
    }
    //All shapes must have a method called getArea().
    public double getArea(){
        //We need to return some value to compile the program.
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }
    }
