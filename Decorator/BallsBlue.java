package holiday_decorations;

public class BallsBlue extends HolidayDecoration {

	public BallsBlue(HolidayItem item) {
		super(item);
	}

	@Override
	public double cost() {
		return super.getWrappedItem().cost() + 2.0;
	}

	@Override
	public String description() {
		return super.getWrappedItem().description() + "\nBlue Ornaments";
	}


}
