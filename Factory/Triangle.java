package shapes;

class Triangle extends Shape {

	Triangle(String name, double height, double width) {
		super(name, height, width);
	}

	@Override
	public double computeArea(double height, double width) {
		if (height <= 0 || width <= 0) {
			System.out.println("One or more parameters less than zero");
			return 0;
		}
		else {
			return (height * width) / 2;
		}
	}

}
