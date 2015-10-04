public abstract class Shape{
    private String shapeType;
    private String shapeName;
    
    public String getShapeType(){
        return this.shapeType;
    }
    public String getShapeName(){
        return this.shapeName;
    }
    public void setShapeType(String type){
        this.shapeType = type;
    }
    public void setShapeName(String name){
        this.shapeName = name;
    }
    public abstract double getArea();
    public abstract void printDescription();
}