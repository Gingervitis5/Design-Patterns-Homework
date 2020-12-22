
public class EyeOfSauronMain {

	public static void main(String[] args) {
		
		EyeOfSauron eye = new EyeOfSauron();
		BadGuy saruman = new BadGuy(eye, "Saruman");
	    BadGuy witchKing= new BadGuy(eye, "Witch King");
	    eye.setEnemies(new GoodGuy(1, 1, 2, 0)); System.out.println();
	    
	    saruman.defeated();
	    
	    eye.setEnemies(new GoodGuy(2, 1, 1, 3)); System.out.println();
	    
	    witchKing.defeated();
	    
	    eye.setEnemies(new GoodGuy(100, 100, 100, 100));

	}

}
