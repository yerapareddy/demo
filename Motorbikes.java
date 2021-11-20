package javatraining;

public class Motorbikes {
	private int speed;

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void incSpeed(int byHowMuch){
		if(byHowMuch >0){
		this.speed+=byHowMuch; //this.speed = this.speed+byHowMuch
		}
	}
	public void decSpeed(int byHowMuch){
		
		if(this.speed-byHowMuch >0) {//this.speed = this.speed-byHowMuch
			setSpeed(this.speed-byHowMuch);
		}
	}
	
	
}
