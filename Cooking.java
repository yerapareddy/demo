package javatraining;

public abstract class Cooking {
		public String s;
		public void execute(){
			getingredients();
			getutensils();
			cook();
			cleanutensils();
		}
		
		abstract void getingredients();
		abstract void getutensils();
		abstract void cook();
		abstract void cleanutensils();
}
