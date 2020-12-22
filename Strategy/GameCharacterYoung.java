
public class GameCharacterYoung extends GameCharacter {

	
	public GameCharacterYoung(GuitarBehavior newGuitar, SoloBehavior soloAct, int playerNum, String name) {
		super(newGuitar, soloAct, playerNum, name);
	}
	
	@Override
	public void displayCharacter() {
		System.out.println("Player " + getPlayerNum() + " has chosen Angus Young");

	}

}
