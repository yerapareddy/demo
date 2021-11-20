package javatraining;

public class Motorbikesrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motorbikes yamaha = new Motorbikes();
		Motorbikes honda = new Motorbikes();
		yamaha.setSpeed(100);
		honda.setSpeed(200);
		System.out.println(yamaha.getSpeed());
		
		yamaha.incSpeed(100);
		honda.incSpeed(200);
		System.out.println(yamaha.getSpeed());
		yamaha.incSpeed(-100);
		System.out.println(yamaha.getSpeed());
		honda.decSpeed(500);
		System.out.println(honda.getSpeed());
		yamaha.decSpeed(100);
		System.out.println(yamaha.getSpeed());
		System.out.println(honda.getSpeed());
	}

}
