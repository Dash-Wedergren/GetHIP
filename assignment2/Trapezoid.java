public class Trapezoid extends Shape implements Printable{
    private double baseA;
    private double baseB;
    private double height;
    private double area;
    
    public Trapezoid(int baseA, int baseB, int height){
        super();
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
        setShapeType("Quadrilateral");
        setShapeName("Trapezoid");
        area = ((this.baseA + this.baseB)/2)*this.height;
    }
    public double getArea(){
        return area;
    }
    @Override
    public void printDescription(){
        System.out.println("Type is: " + getShapeType() + "\nBase A: " + baseA + "\nBase B: " + baseB + "\nHeight: " + height + "\n");    
    }
}