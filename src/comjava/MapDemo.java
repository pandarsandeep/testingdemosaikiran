package comjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "sai");
		hashMap.put(23, "raj");
		hashMap.put(19, "pai");
		hashMap.put(44, "has");
		hashMap.put(11, "santu");
//		for (Entry res : hashMap.entrySet()) {
//			System.out.println(res.getKey() + " " + res.getValue());
//
//		}
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
	}

}
