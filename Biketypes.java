package javatraining;

public class Biketypes {
	int speed;
	String brand;
	
	public void state(){
		System.out.println("bike is starting");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biketypes suzuki = new Biketypes();
		Bikerunner yamaha= new Bikerunner();
		Hondabike honda = new Hondabike();
		suzuki.state();
		yamaha.state();
		honda.state();
	}
}
