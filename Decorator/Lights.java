package holiday_decorations;

public class Lights extends HolidayDecoration {

	public Lights(HolidayItem item) {
		super(item);
	}

	@Override
	public double cost() {
		return super.getWrappedItem().cost() + 5.0;
	}

	@Override
	public String description() {
		return super.getWrappedItem().description() + "\nLights";
	}
	


}
