package holiday_decorations;

public class LEDs extends HolidayDecoration {
	
	public LEDs(HolidayItem item) {
		super(item);
	}

	@Override
	public double cost() {
		return super.getWrappedItem().cost() + 10.0;
	}

	@Override
	public String description() {
		return super.getWrappedItem().description() + "\nLEDs";
	}
	

}
