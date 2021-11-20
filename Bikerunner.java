package javatraining;

public class Bikerunner extends Biketypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biketypes yamaha = new Biketypes();
		yamaha.state();
		yamaha.speed=100;
		System.out.println(yamaha.speed);
		//state();
	}
	
	public  void state(){
		System.out.println("Bike stopped");
	}
	
	

}
