public class Triangle extends Shape implements Printable{
    private double base;
    private double height;
    private double area;
    
    public Triangle(int base, int height){
        super();
        this.base = base;
        this.height = base;
        setShapeType("Triangle");
        setShapeName("Triangle");
        this.area = base * height * 0.5;
    }
    public double getArea(){
        return this.area;
    }
    public void printDescription(){
        System.out.println("Base: "+ base +"\n Height: " + height + "\n Area: " + getArea() + "\n");
    }
}