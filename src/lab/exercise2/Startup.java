package lab.exercise2;

/**
 *
 * @author jlombardo
 */
public class Startup {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        Shape rectangle = new Rectangle();
        System.out.println("\nRectangle with normal border");
        rectangle.draw();

        System.out.println("\nCircle with a red border.");
        RedShapeDecorator redCircle = new RedShapeDecorator(circle);
        redCircle.draw();
        
        System.out.println("\nRectangle with a red border.");
        RedShapeDecorator redRectangle = new RedShapeDecorator(rectangle);
        redRectangle.draw();
        // do output for decorated shapes here...
        
    }
}
