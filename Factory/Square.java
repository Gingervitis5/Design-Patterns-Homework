package shapes;

class Square extends Shape {

	Square(String name, double height, double width) {
		super(name, height, width);
	}

	@Override
	public double computeArea(double height, double width) {
		if (height != width){
			System.out.println("Not a square");
			return 0;
		}
		else if (height <= 0 || width <= 0) {
			System.out.println("One or more parameters less than zero");
			return 0;
		}
		return height * width;
	}

}
