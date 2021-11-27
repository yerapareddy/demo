package exceptions;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		preincremental();
		int i=1;
		System.out.println(i++);//i+1 //post incremental operator
		System.out.println(i);
	}
	
	public static void preincremental() {
		// TODO Auto-generated method stub
		int j=1;
		System.out.println(++j);//pre incremental operator
		
		int i=1;
		System.out.println(i++ + ++i - ++j + --j + j--);
	}

}
