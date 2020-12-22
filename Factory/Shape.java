package shapes;

public abstract class Shape implements Comparable<Shape>{
	
	private String name;
	private double height;
	private double width;

	Shape(String name, double height, double width) {
		this.name = name;
		this.height = height;
		this.width = width;
	}
	
	public abstract double computeArea(double height, double width);
	
	public int compareTo(Shape s1) {
		double difference = Math.abs(s1.computeArea(s1.height, s1.width) - this.computeArea(this.height, this.width));
		if (s1.name.equalsIgnoreCase(this.name)) {
			if ( difference <= 0.1 && difference >= -0.1) {
				return 0;
			}
			else if (s1.computeArea(s1.height, s1.width) > this.computeArea(this.height, this.width)) {
				return -1;
			}
			else {
				return 1;
			}
		} 
		else {
			return s1.name.compareTo(this.name);
		}
	}
	
	public void printResults() {
		double area = this.computeArea(height, width);
		System.out.println("Name: " + this.name +  "   Area: " + area + "\n");
	}
	
}
