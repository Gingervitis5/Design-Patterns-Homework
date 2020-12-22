import java.util.ArrayList;
import java.util.Collections;

import shapes.Shape;
import shapes.ShapeFactory;

public class ShapeTester {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		ArrayList<Shape> shapeList = new ArrayList<Shape>();
		
		shapeList.add(shapeFactory.createShape("Rectangle", 6, 8));
		shapeList.add(shapeFactory.createShape("Triangle", 7, 5));
		shapeList.add(shapeFactory.createShape("Circle", 5, 0));
		shapeList.add(shapeFactory.createShape("Square", 1, 1));
		shapeList.add(shapeFactory.createShape("Rectangle", 3, 1));
		shapeList.add(shapeFactory.createShape("Circle", 5, 0));
		shapeList.add(shapeFactory.createShape("Triangle", 2, 5));
		shapeList.add(shapeFactory.createShape("Rectangle", 7, 8));
		shapeList.add(shapeFactory.createShape("Square", 1, 1));
		shapeList.add(shapeFactory.createShape("Circle", 10, 0));
		shapeList.add(shapeFactory.createShape("Triangle", 5, 2));
		shapeList.add(shapeFactory.createShape("Square", 4, 4));
		shapeList.add(shapeFactory.createShape("Triangle", 4, 6));
		shapeList.add(shapeFactory.createShape("Circle", 2, 0));
		shapeList.add(shapeFactory.createShape("Rectangle", 8, 6));
		shapeList.add(shapeFactory.createShape("Square", 5, 5));
		
		printArr(shapeList);
		System.out.print("\n\n");
		
		Collections.sort(shapeList);
		
		printArr(shapeList);
	}
	
	private static void printArr(ArrayList<Shape> shapeList) {
		for (Shape s : shapeList) {
			s.printResults();
		}
	}

}
