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
public class Circle extends Shape{
    
 private double pi = 3.1416;
 private double length;
     
    public Circle( double length) 
    {
        setLength(length);
    }
    
    private void setLength(double length) 
    {
        this.length = length; 
    }

    @Override
    void calcArea() 
    {
        super.area = (length / 2) * (length / 2) * pi; 
    }

    @Override
    void calcPerimeter() 
    {
        super.perimeter = pi * length;
    }
       
}
