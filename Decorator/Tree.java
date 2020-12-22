package holiday_decorations;

public class Tree implements HolidayItem{

	private String treeName;
	private double cost;
	
	public Tree(String name, double cost) {
		this.treeName = name;
		this.cost = cost;
	}
	
	@Override
	public double cost() {
		return this.cost;
	}

	@Override
	public String description() {
		return "This tree is a " + this.treeName + " and has these decorations:";
	}
	
}
