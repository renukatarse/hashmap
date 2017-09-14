package hashmap;


import java.util.*;

public class HashmapPut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        // create map
	        Map<String,String> map = new HashMap<String,String>();
	        
	        // populate the map
	        map.put("1","ALIVE ");
	        map.put("2","IS");
	        map.put("3","AWESOME");
	        
	        // create a synchronized map
	        Map<String,String> syncMap = Collections.synchronizedMap(map);
	        
	        System.out.println("Synchronized map :"+syncMap);
	    }


	}


