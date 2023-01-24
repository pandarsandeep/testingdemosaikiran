package comjava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfCharectors {

	public static void main(String[] args) {
		String s = "sandeep";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (Character ch : s.toCharArray()) {
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);

		}
		for(Map.Entry<Character, Integer> res: map.entrySet()) {
			System.out.println(res.getKey() + " " + res.getValue());
		}

	}

}
