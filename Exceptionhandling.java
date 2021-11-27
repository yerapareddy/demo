package exceptions;

import java.io.FileNotFoundException;

public class Exceptionhandling {

	public static void main(String[] args) {
		
		try{
		// TODO Auto-generated method stub
			stringnull(null);
			throwableexception();
			throwsexception();
			
		int i= 2/0;
		System.out.println(i);
		
		}catch(Exception e){
			System.out.println("login page --"+e);
			int i=2;
			System.out.println(i);
		}finally{
			System.out.println("logging off");
		}
	}
	
	public static void stringnull(String s){
		try{
			
		
		System.out.println(s.toString());
		}catch(NullPointerException e){
			System.out.println("stringnull --"+e);
			stringnull("name");
		}
		catch(ArithmeticException r){
			System.out.println("stringarithmeticexception--"+r);
		}
		catch(Exception e){
			System.out.println("stirnnullexception--"+e);
		}
	}

	public static void throwsexception(){
		throw new ArrayIndexOutOfBoundsException();
	}
	
	public static void throwableexception() throws ArrayIndexOutOfBoundsException,FileNotFoundException{
		System.out.println("throwable exception");
		
	}
}
