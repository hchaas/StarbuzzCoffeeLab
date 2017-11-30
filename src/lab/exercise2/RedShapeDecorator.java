
package lab.exercise2;

public class RedShapeDecorator extends ShapeDecorator {
    
    public RedShapeDecorator(Shape shapeToDecorate){
        super(shapeToDecorate);
    }
    
    @Override
    public void draw(){       
        super.draw();
        System.out.println("Border: red");
    }
}
