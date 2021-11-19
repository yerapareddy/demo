package javatraining;
// subclass extends parentclass
public class superkeyword extends constructortraining{
	static int d=120;
	public static void main(String[] args) {
		
		superkeyword s= new superkeyword();
		s.inherit();
	}
	
	public void inherit(){
		constructortraining ct = new constructortraining(11);
		System.out.println(d);
		System.out.println(super.d);
	}
	
}
