package holiday_decorations;

public abstract class HolidayDecoration implements HolidayItem{

	private HolidayItem wrappedItem;
	
	public HolidayDecoration(HolidayItem item) {
		this.wrappedItem = item;
	}

	public HolidayItem getWrappedItem() {
		return wrappedItem;
	}
	
	public String getDescription() {
		return wrappedItem.description();
	}
	
}
