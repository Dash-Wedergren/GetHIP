import java.util.*;

public class Sort {
    
    public static void main(String[] args){
        List<Double> unsorted = new ArrayList<Double>();
	    List<Shape> shapes = new ArrayList<Shape>();
        Integer counter = 0;
        shapes.add(new Rectangle(8, 3));
	    shapes.add(new Rhombus(6, 5));
        shapes.add(new Triangle(6, 2));
	    shapes.add(new Triangle(6, 4));
	    shapes.add(new Trapezoid(4, 10, 5));
        shapes.add(new Circle(2));
        shapes.add(new Triangle(1,1));
        
        for(Shape s : shapes){
            unsorted.add(s.getArea());
        }
        
        System.out.println(unsorted);
        
        //Insertion Sort        
        for(Integer i = 0;i<unsorted.size();i++){
            counter = i;
            double current = unsorted.get(i);
            //while position is greater than 0 check if current value is greater than previous element
            while((counter > 0) && (unsorted.get(counter-1) > current)){
                //shift other numbers then subtract from counter
                unsorted.set(counter, unsorted.get(counter-1));
                counter--;
            }
            //set element to position found
            unsorted.set(counter, current);
        };
        
        System.out.println(unsorted);
    }
}