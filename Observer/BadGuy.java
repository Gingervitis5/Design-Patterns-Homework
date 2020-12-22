import java.util.Observable;
import java.util.Observer;

public class BadGuy implements Observer {

	private EyeOfSauron eye;
	private GoodGuy goodGuy;
	private String name;
	
	public BadGuy(EyeOfSauron eye, String name) {
		this.eye = eye;
		this.name = name;
		this.eye.addObserver(this);
	}
	
	public void defeated() {
		this.eye.deleteObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.goodGuy = (GoodGuy)arg;
		System.out.println("The villain " + this.name + " knows of " + goodGuy.getNumHobbits() + " hobbits, " +
				goodGuy.getNumElves() + " elves, " + goodGuy.getNumDwarves() + " dwarves, and "
				+ goodGuy.getNumHumans() + " humans.");
	}

}
