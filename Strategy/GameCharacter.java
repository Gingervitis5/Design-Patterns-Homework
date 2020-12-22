
public abstract class GameCharacter {

	private String charName;
	private int playerNumber;
	private GuitarBehavior guitarBehavior;
	private SoloBehavior soloBehavior;
	
	public GameCharacter(GuitarBehavior newGuitar, SoloBehavior soloAct, int playerNum, String name) {
		this.guitarBehavior = newGuitar;
		this.soloBehavior = soloAct;
		this.playerNumber = playerNum;
		this.charName = name;
	}
	
	public void performSolo() {
		System.out.print(this.charName);
		soloBehavior.performSolo();
	}
	
	public void playGuitar() {
		System.out.print(this.charName);
		guitarBehavior.playGuitar();
	}
	
	public void setGuitar(GuitarBehavior newGuitar) {
		this.guitarBehavior = newGuitar;
	}
	public void setPlayerNum(int num) {
		this.playerNumber = num;
	}
	
	public int getPlayerNum() {
		return this.playerNumber;
	}
	
	public void setSoloAct(SoloBehavior newSoloAct) {
		this.soloBehavior = newSoloAct;
	}
	
	public abstract void displayCharacter();
	
}
