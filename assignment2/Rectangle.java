public class Rectangle extends Shape implements Printable{
    private double height;
    private double width;
    private double area;
    
    public Rectangle(int height, int width){
        super();
        this.height = height;
        this.width = width;
        setShapeType("Quadrilateral");
        setShapeName("Rectangle");
        area = this.height * this.width;
    }
    public double getArea(){
        return area;
    }
    public void printDescription(){
       System.out.println("Height: " + height+ "\n Width: " + width + "\n Area: " + getArea() + "\n");    
    }
}