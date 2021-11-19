package javatraining;

public class constructortraining {
	
	static int d;  //class variable
	static String s;
	final static int f=130; //once it is initialised , it cannot be changed
	
	//default constructor
	public constructortraining(){
		d=10;
	}
	
	//parameterised constructor
	public constructortraining(int d){
		this.d=d;
	}
	
	public constructortraining(int a,String c){
		d=a;
		s=c;
	}	
	

	public static void main(String[] args) {
		String name="why"; //local variable
		// TODO Auto-generated method stub
		System.out.println(d+ " === "+s);
		constructortraining ct = new constructortraining();
		System.out.println(ct.d);
		constructortraining ct1 = new constructortraining(100);
		System.out.println(ct1.d);
		constructortraining ct2 = new constructortraining(1,name);
		System.out.println(ct2.d+"==="+ct2.s);
		
	}

}
