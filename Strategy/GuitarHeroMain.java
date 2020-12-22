
public class GuitarHeroMain {

	public static void main(String[] args) {
		
		GameCharacter player1 = new GameCharacterSlash(new Gibson_SG(), new Guitar_On_Fire(), 1, "Slash");
		GameCharacter player2 = new GameCharacterHendrix(new Fender_Telecaster(), new Jump_Off_Stage(), 2, "Jimi Hendrix");
		GameCharacter player3 = new GameCharacterYoung(new Gibson_Flying_V(), new Smash_Guitar(), 3, "Angus Young");
		
		player1.displayCharacter();
		player2.displayCharacter();
		player3.displayCharacter(); System.out.println();
		
		player1.playGuitar();
		player1.performSolo(); System.out.println();
		player2.playGuitar();
		player2.performSolo(); System.out.println();
		player3.playGuitar();
		player3.performSolo(); System.out.print("\n\n");
		
		player1.setGuitar(new Fender_Telecaster()); player1.setSoloAct(new Smash_Guitar());
		player2.setGuitar(new Gibson_Flying_V()); player2.setSoloAct(new Guitar_On_Fire());
		player3.setGuitar(new Gibson_SG()); player3.setSoloAct(new Jump_Off_Stage());
		
		player1.playGuitar();
		player1.performSolo(); System.out.println();
		player2.playGuitar();
		player2.performSolo(); System.out.println();
		player3.playGuitar();
		player3.performSolo();

	}

}
