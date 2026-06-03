package Java_MostAsked;

import java.util.HashMap;
import java.util.Map;

public class Count_Frequency_Using_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "himanshu";
		char[] c = s.toCharArray();
		Map<Character,Integer>m = new HashMap<Character,Integer>();
		for(char ch :c) {
			if(!m.containsKey(ch)) {
				m.put(ch, 1);
			}else {
				m.put(ch,m.get(ch)+1);
			}
		}
		
		System.out.println(m);

	}

}
