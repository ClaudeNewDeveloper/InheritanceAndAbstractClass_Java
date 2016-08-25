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
public abstract class Shape {
    
   protected  double area;
   protected double perimeter;
    
    public Shape()
    {
       area = 0.0;
       perimeter = 0.0;
        
    }
    
    abstract void calcArea();
    
    abstract void calcPerimeter();
    
    double getPerimeter() 
    {
         return perimeter;    
    }
    
    double getArea() 
    {
        return area;
    }
       
}
