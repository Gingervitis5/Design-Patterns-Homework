package holiday_decorations;

public class BallsRed extends HolidayDecoration {

	public BallsRed(HolidayItem item) {
		super(item);
	}

	@Override
	public double cost() {
		return super.getWrappedItem().cost() + 1.0;
	}

	@Override
	public String description() {
		return super.getWrappedItem().description() + "\nRed Ornaments";
	}
	


}
