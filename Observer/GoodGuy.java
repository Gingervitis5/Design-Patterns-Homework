
public class GoodGuy {

	private int numHobbits;
	private int numElves;
	private int numDwarves;
	private int numHumans;
	
	public GoodGuy(int hobbits, int elves, int dwarves, int humans) {
		this.numHobbits = hobbits;
		this.numElves = elves;
		this.numDwarves = dwarves;
		this.numHumans = humans;
	}
	
	public int getNumHobbits() {
		return numHobbits;
	}
	public int getNumElves() {
		return numElves;
	}
	public int getNumDwarves() {
		return numDwarves;
	}
	public int getNumHumans() {
		return numHumans;
	}
	
}
