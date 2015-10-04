public class Rhombus extends Shape implements Printable{
    private double diagonalA;
    private double diagonalB;
    private double area;
    
    public Rhombus(int diagonalA, int diagonalB){
        super();
        this.diagonalA = diagonalA;
        this.diagonalB = diagonalB;
        setShapeType("Quadrilateral");
        setShapeName("Rhombus");
        area = (diagonalA * diagonalB)/2;
    }
    public double getArea(){
        return area;
    }
    public void printDescription(){
        System.out.println("Diagonal A: " + diagonalA + "\n Diagonal B: " + diagonalB+ "\n Area: " + getArea() + "\n");    
    }
}