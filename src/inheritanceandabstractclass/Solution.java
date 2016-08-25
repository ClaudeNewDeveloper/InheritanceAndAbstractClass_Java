/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritanceandabstractclass;

import java.util.Scanner;

/**
 *
 * @author besthon1
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
       Scanner sc = new Scanner(System.in);
       
       
       System.out.print("Enter the radius of a circle [1 to 10]: ");
       int userInputRadiusOfCircle = sc.nextInt();
       
       System.out.print("Enter the length of a rectangle [1 to 10]: ");
       int userInputLengthOfRectangle = sc.nextInt();
       
       System.out.print("Enter the width of a rectangle [1 to 10]: ");
       int userInputWidthOfRectangle = sc.nextInt();
       
       double radius =  2 * userInputRadiusOfCircle;
          
       Circle circle = new Circle(radius);
       
       Rectangle rectangle = new Rectangle(userInputLengthOfRectangle,userInputWidthOfRectangle );
     
       System.out.println();
       
       
       System.out.println("Circle:");
       circle.calcArea(); 
       circle.calcPerimeter();
       System.out.println("     Area:  " + String.format("$%.3f", circle.getArea())) ;
       System.out.println("     Perimeter:  " + String.format("$%.3f", circle.getPerimeter())) ;
      
       System.out.println();
       
       System.out.println("Rectangle:");
       rectangle.calcArea();
       rectangle.calcPerimeter();
       System.out.println("     Area:  " + String.format("$%.3f", rectangle.getArea())) ;
       System.out.println("     Perimeter:  " + String.format("$%.3f",  rectangle.getPerimeter())) ;
      
    }
    
}
