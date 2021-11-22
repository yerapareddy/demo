package javatraining;

public class Gamerunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamingconsole mario= new Mariogame();
		Gamingconsole chess = new Chessgame();
		
		chess.uparrow();
		chess.downarrow();
		chess.leftarrow();
		chess.rightarrow();
		mario.uparrow();
		mario.downarrow();
		mario.rightarrow();
		mario.leftarrow();
	}

}
