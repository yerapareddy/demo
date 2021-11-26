package loops;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("5*2="+5*2);
		loops loops = new loops();
		//loops.forloop();
		//loops.forloop(19);
		//loops.forloop(22, 11,15);
		//loops.whileloop();
		loops.dowhileloop();
	}
	
	//types of loops
	//for
	//while
	//do while
	
	public void forloop(){
		//syntax of for loop
		//for(initialization;condition;incremental/decremental operators)
		//i++ is nothing but i=i+1
		for(int i=1;i<=10;i++){
			System.out.println("5 * "+i +" = "+5*i);
		}			
	}
	
	public void forloop(int table){
		//syntax of for loop
		//for(initialization;condition;incremental/decremental operators)
		//i++ is nothing but i=i+1
		for(int i=1;i<=10;i++){
			System.out.println(table+" * "+i +" = "+table*i);
		}			
	}
	
	public void forloop(int table,int from,int to){
		//syntax of for loop
		//for(initialization;condition;incremental/decremental operators)
		//i++ is nothing but i=i+1
		for(int i=from;i<=to;i++){
			System.out.println(table+" * "+i +" = "+table*i);
		}			
	}
	
	public void whileloop(){
		int i=1;
		
		while(i<=10){
			
			System.out.println("before"+i);
			i++;
		}
	}
	
	public void whileloop(String a){
		
		while(a.equals("Yes")){
			System.out.println("print");
		}		
	}
	
	public void dowhileloop(){
		int i=1;
		do{	
			
			System.out.println("before"+i);
			i++;
		}while(i<=10);
	}
}
