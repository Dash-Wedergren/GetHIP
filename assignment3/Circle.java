public class Circle extends Shape implements Printable{
    private double radius;
    private double area;
    
    public Circle(int radius){
        super();
        this.radius = radius;
        setShapeType("Circle");
        setShapeName("Circle");
        area = Math.PI * radius * radius;
    }
    public double getArea(){
        return area;
    }
    @Override
    public void printDescription(){
        System.out.println("Type: " + getShapeType() + "\nRadius: " + radius + "\n");
    }
}