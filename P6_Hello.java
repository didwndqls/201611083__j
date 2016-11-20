public class P6_Hello{
	public void reverse_word(String words){
		char[] word = words.toCharArray();
		StringBuilder reverse = new StringBuilder();
		for(int i=word.length-1;i>=0;i--){
			reverse.append(word[i]);
		}
		System.out.println(reverse);
	}
	public static void main(String[] args) {
		P6_Hello p6 = new P6_Hello();
		String words = "Hello";
		p6.reverse_word(words);
	}
}
