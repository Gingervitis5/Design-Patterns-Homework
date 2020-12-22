package holiday_decorations;

public class BallsSilver extends HolidayDecoration {

	public BallsSilver(HolidayItem item) {
		super(item);
	}

	@Override
	public double cost() {
		return super.getWrappedItem().cost() + 3.0;
	}

	@Override
	public String description() {
		return super.getWrappedItem().description() + "\nSilver Ornaments";
	}

}
