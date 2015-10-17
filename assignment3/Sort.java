import java.util.*;

public class Sort {
    
    public static void main(String[] args){
        List<Shape> sorted = new ArrayList<Shape>();
        List unsorted = new ArrayList();
	    List<Shape> shapes = new ArrayList<Shape>();
	    List position = new ArrayList();
        Integer counter = 0;
        Integer current;
        shapes.add(new Circle(6));
	    shapes.add(new Triangle(6, 4));
	    shapes.add(new Rectangle(8, 3));
	    shapes.add(new Rhombus(6, 5));
	    shapes.add(new Trapezoid(4, 10, 5));
        for(Integer i = 0;i<shapes.size();i++){
            position.add(i);
        }
        for(Shape s : shapes){
            unsorted.add(s.getArea());
            //position.add()
        }
        for(Integer i = 0;i<unsorted.size();i++){
            current = unsorted.get(i);
            counter = i;
            while(counter > 0 && unsorted.get(counter-1) > current){
                unsorted.set(counter, unsorted.get(counter-1));
                counter--;
            }
            unsorted.set(counter, current);
        };
        System.out.println(unsorted);
    }
}