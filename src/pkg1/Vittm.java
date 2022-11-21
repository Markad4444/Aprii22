package pkg1;

import java.util.HashMap;
import java.util.Hashtable;

public class Vittm {
	public static void main(String[] args) {
		HashMap<Object, Object> map = new HashMap();
		map.put(1,"mumbai");
		map.put(" city 1", "kolkatta");
		map.put(5,"delhi");
		map.put("city2" ,"goa");
		map.put(4,"pune");
		System.out.println(map);
	//	for(Map.Entry<Object,Object> k : map.entrySet())
	//	{ System.out.println(k.getkey()  + "--->" k.getvalue());
	//	}
		//Set mapset =map.entrySet();
		//Iterator it = mapSet.iterator();
		//}
		Hashtable<Object,Object> map1 = new Hashtable<>();
		map1.put(1,"mumbai");
		map1.put(" city 1", "kolkatta");
		map1.put(5,"delhi");
		map1.put("city2" ,"goa");
		map1.put(4,"pune");
		System.out.println(map1);
	
		
		
	}

}
