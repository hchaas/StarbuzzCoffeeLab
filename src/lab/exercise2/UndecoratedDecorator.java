/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exercise2;

/**
 *
 * @author User
 */
public class UndecoratedDecorator extends ShapeDecorator{
    
    public UndecoratedDecorator(Shape shapeToDecorate){
        super(shapeToDecorate);
    }
    
    public void draw(){
        super.draw();
        System.out.println("Border: none");
    }
}
