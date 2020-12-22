package holiday_decorations;

import java.util.Scanner;

public class Star extends HolidayDecoration{

	private Star(HolidayItem item) {
		super(item);
	}

	@Override
	public double cost() {
		return super.getWrappedItem().cost() + 4.0;
	}

	@Override
	public String description() {
		return super.getWrappedItem().description() + "\nStar";
	}
	
	public static HolidayItem getStar(HolidayItem item) {
		if (getHasStar(item)) {
			return new Star(item);
		}
		else {
			System.out.println("This tree already has a star!");
			return item;
		}
	}
	
	private static boolean getHasStar(HolidayItem item) {
		String description = item.description();
		Scanner ss = new Scanner(description);
		ss.next();
		while(ss.hasNext()) {
			if (ss.nextLine().equals("Star")) {
				ss.close();
				return false;
			}
		}
		ss.close();
		return true;
	}
	
}
