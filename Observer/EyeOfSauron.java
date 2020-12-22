import java.util.Observable;

public class EyeOfSauron extends Observable{
	
	public EyeOfSauron() {}
	
	public void setEnemies(GoodGuy goodGuy) {
		System.out.println("The eye sees " + goodGuy.getNumHobbits() + " hobbits, " +
				goodGuy.getNumElves() + " elves, " + goodGuy.getNumDwarves() + " dwarves, and "
				+ goodGuy.getNumHumans() + " humans.");
		this.setChanged();
		notifyObservers(goodGuy);
		this.clearChanged();
	}
	
}
