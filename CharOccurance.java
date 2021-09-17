package assessmentweek3;

import java.util.HashMap;
import java.util.Map;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "Java";
					char[] chararr =str.toCharArray();
			Map<Character,Integer> charCount=new HashMap<Character,Integer>();
			for (char ch : chararr) {
				if(charCount.containsKey(ch)){
					charCount.put(ch, charCount.get(ch)+1);
				} 
				else{
					charCount.put(ch, 1);
				}
			}
			System.out.print(charCount);
		}

	}

