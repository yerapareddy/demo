package javatraining;

//syntax for class
//accessmodifier class classname
public class airport {
	
	//all execution starts from main methods
	public static void main(String[]args){
		
		//syntax for object
		//classname objectname = new classname()
		airport pilot = new airport(); //instance
		Bikes hero = new Bikes();
		hero.changegear();
		//hero.setspeed(); -- cannot be accessed as it is a private method
		hero.getspeed();
		pilot.eating();
	}
	//syntax for method
	//accessmodifier returntype methodname
	void eating(){
		System.out.println("pilot is eating");
	}
}
