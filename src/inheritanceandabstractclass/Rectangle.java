/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritanceandabstractclass;

/**
 *
 * @author besthon1
 */
public class Rectangle extends Shape {
    
    private double length;
    private double width;
    
    public Rectangle(double length, double width)
    {  
        setLength(length);
        setWidth(width);
    }
   
    @Override
    void calcArea() 
    {
        super.area = length * width;
    }

    @Override
    void calcPerimeter() 
    { 
        super.perimeter = 2 * (this.length + this.width); 
    }
   
    private void setLength(double length) 
    {
        this.length = length;
    }
    
     private void setWidth(double width)
    {
        this.width = width;
    }


   

    
}
