import holiday_decorations.*;

public class TreeTester {

	public static void main(String[] args) {
		HolidayItem douglasFir = new Tree("Douglas Fir", 30.0);
		douglasFir = new Ruffles(douglasFir);
		douglasFir = new BallsRed(douglasFir);
		douglasFir = Star.getStar(douglasFir);
		System.out.println(douglasFir.description() + "\nCost: " + douglasFir.cost() + "\n\n");
		
		HolidayItem fraserFir = new Tree("Fraser Fir", 35.0);
		fraserFir = new BallsSilver(fraserFir);
		fraserFir = new BallsBlue(fraserFir);
		System.out.println(fraserFir.description() + "\nCost: " + fraserFir.cost() + "\n\n");
		
		HolidayItem balsamFir = new Tree("Balsam Fir", 25.0);
		balsamFir = new Lights(balsamFir);
		balsamFir = new LEDs(balsamFir);
		System.out.println(balsamFir.description() + "\nCost: " + balsamFir.cost() + "\n\n");
		
		HolidayItem coloradoBlueSpruce = new Tree("Colorado Blue Spruce", 50.0);
		coloradoBlueSpruce = Star.getStar(coloradoBlueSpruce);
		coloradoBlueSpruce = Star.getStar(coloradoBlueSpruce);
		coloradoBlueSpruce = Star.getStar(coloradoBlueSpruce);
		coloradoBlueSpruce = new LEDs(coloradoBlueSpruce);
		coloradoBlueSpruce = new BallsRed(coloradoBlueSpruce);
		coloradoBlueSpruce = new BallsBlue(coloradoBlueSpruce);
		coloradoBlueSpruce = new Ruffles(coloradoBlueSpruce);
		System.out.println(coloradoBlueSpruce.description() + "\nCost: " + coloradoBlueSpruce.cost() + "\n\n");
	}

}
