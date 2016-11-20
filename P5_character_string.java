import java.util.*;

public class P5_character_string{
	public void countChars(String letters){
		char[] letter = letters.toCharArray();
		Map<String, Integer> words = new HashMap<String,Integer>();
		String w;
		for(char c:letter){
			w = Character.toString(c);
			if(words.containsKey(w)){
				words.put(w,words.get(w)+1);
			} else {
				words.put(w,1);
			}
		}
		System.out.println(words);
	}
	public static void main(String[] args){
		P5_character_string p5 = new P5_character_string();
		String letter = "sangmyung university";
		p5.countChars(letter);
	}
}