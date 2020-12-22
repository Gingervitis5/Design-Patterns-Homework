package holiday_decorations;

public class Ribbons extends HolidayDecoration {

	public Ribbons(HolidayItem item) {
		super(item);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		return super.getWrappedItem().cost() + 2.0;
	}

	@Override
	public String description() {
		return super.getWrappedItem().description() + "\nRibbons";
	}
	
}
