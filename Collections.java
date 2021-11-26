package loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import org.omg.Messaging.SyncScopeHelper;

public class Collections {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array		
		String [] values = new String[3];
		values[0]="first";
		values[1]="second";
		values[2]="third";	
		
		//ArrayList
		ArrayList<String> val = new ArrayList();
		val.add("first");
		val.add("second");
		val.add("third");
		System.out.println(val.get(2));
		
		ArrayList<int[]> nums= new ArrayList();
		
		//LinkedList
		LinkedList<String> num = new LinkedList();
		num.add("first");
		num.add("second");
		System.out.println(num.get(1));
		
		HashMap<String,String> map = new HashMap();
		map.put("place", "dmm");
		map.put("zipcode", "515671");
		System.out.println(map.get("place"));
		map.forEach((k,v) ->
		System.out.println(k+"==="+v)
		);
		
	}

}
