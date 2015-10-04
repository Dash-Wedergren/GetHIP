public class Circle extends Shape implements Printable{
    private double radius;
    private double area;
    
    public Circle(int radius){
        super();
        this.radius = radius;
        setShapeType("Circle");
        setShapeName("Circle");
        area = 3.14 * radius * radius;
    }
    public double getArea(){
        return area;
    }
    public void printDescription(){
        System.out.println("Radius: " + radius + "\n Area: " + getArea() + "\n");
    }
}