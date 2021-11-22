package javatraining;

public class Mariogame implements Gamingconsole,multipleinterface {

	@Override
	public void uparrow() {
		System.out.println("jump");
	}

	@Override
	public void downarrow() {
		System.out.println("down");
		
	}

	@Override
	public void leftarrow() {
		System.out.println("backwards");
		
	}

	@Override
	public void rightarrow() {
		System.out.println("move forward");
		
	}

}
