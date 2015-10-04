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
    @Override
    public void printDescription(){
        System.out.println("Type: " + getShapeType() + "\nDiagonal A: " + diagonalA + "\nDiagonal B: " + diagonalB+ "\n");    
    }
}