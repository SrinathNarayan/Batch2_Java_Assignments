package Collections;

import java.util.Collections;
import java.util.HashMap;

public class HashmapMaxandSmall {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 88);
		map.put(2, 33);
		map.put(3, 25);
		map.put(4, 52);
		map.put(5, 78);
		System.out.println("LARGEST KEY :");
		int maxkeyInMap = (Collections.max(map.keySet()));
		System.out.println(maxkeyInMap);
		System.out.println("SMALLEST VALUE :");
		int minValueInMap = (Collections.min(map.values()));
		System.out.println(minValueInMap);
}
}