package javatraining;

public class Bikes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bikes Yamaha = new Bikes();
		Bikes Honda = new Bikes();
		Yamaha.changegear();
		Honda.changegear();
		changegear();
		setspeed();
		getspeed();
	}
	
	public static void changegear(){
		System.out.println("changing to 5th gear");
	}
	
	//accessmodidiers
	//public -- it can be accessible from anywhere
	//private -- it can be accessible within class
	//protected -- it can be accessible within package
	
	private static void setspeed(){
		System.out.println("increase speed to 40kmph");
	}
	
	protected static void getspeed(){
		System.out.println("speed of vehicle is 40kmph");
	}
}