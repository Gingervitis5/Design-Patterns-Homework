package shapes;

class Circle extends Shape {

	Circle(String name, double height) {
		super(name, height, 0);
	}

	@Override
	public double computeArea(double height, double width) {
		if (height <= 0) {
			System.out.println("Radius less than zero");
			return 0;
		}
		return height * height * Math.PI;
	}

}
