package shapes;

public class ShapeFactory {

	public Shape createShape(String name, double height, double width) {
		Shape shape = null;
		if (name.toLowerCase().equals("circle")) {
			shape = new Circle(name, height);
		}
		else if (name.toLowerCase().equals("square")) {
			shape = new Square(name, height, width);
		}
		else if (name.toLowerCase().equals("triangle")) {
			shape = new Triangle(name, height, width);
		}
		else if (name.toLowerCase().equals("rectangle")){
			shape = new Rectangle(name, height, width);
		}
		
		return shape;
	}
	
}
