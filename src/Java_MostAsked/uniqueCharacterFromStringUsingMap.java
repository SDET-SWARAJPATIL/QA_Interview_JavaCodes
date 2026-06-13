package Java_MostAsked;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class uniqueCharacterFromStringUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "programming";
		Map<Character ,Integer> m = new HashMap<Character ,Integer>();
		char c[] = s.toCharArray();
		for(char ch : c) {
			if(!m.containsKey(ch)) {
				m.put(ch, 1);
			}else {
				m.put(ch, m.get(ch)+1);
			}
		}
		
		System.out.println(m);
		
		for(Entry<Character,Integer>e:m.entrySet()) {
			if(e.getValue()==1) {
				System.out.println(e.getKey());
			}
		}

	}

}
