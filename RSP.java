public class RSP {
	String sel1;
	String sel2;
	public void rsp_Game(String sel1, String sel2) {
		if(sel1.equals(sel2)){
			System.out.printf("Player1 is %s and Player2 is %s, result: draw.\n",sel1,sel2);
		}
		else if(sel1.equals("r")){
			if(sel2.equals("s")){
				System.out.printf("Player1 is %s and Player2 is %s, result: Player1 won.\n",sel1,sel2);
			}
			else if(sel2.equals("p")){
				System.out.printf("Player1 is %s and Player2 is %s, result: Player2 won.\n",sel1,sel2);
			}
		}
		else if(sel1.equals("s")){
			if(sel2.equals("r")){
				System.out.printf("Player1 is %s and Player2 is %s, result: Player2 won.\n",sel1,sel2);
			}
			else if(sel2.equals("p")){
				System.out.printf("Player1 is %s and Player2 is %s, result: Player1 won.\n",sel1,sel2);
			}
		}
		else if(sel1.equals("p")){
			if(sel2.equals("r")){
				System.out.printf("Player1 is %s and Player2 is %s, result: Player1 won.\n",sel1,sel2);
			}
			else if(sel2.equals("s")){
				System.out.printf("Player1 is %s and Player2 is %s, result: Player2 won.\n",sel1,sel2);
			}
		}
	}
	public static void main(String[] args){
		RSP r = new RSP();
		String[] sel1 = {"r","s","p"};
		String[] sel2 = {"r","s","p"};
		for(String i:sel1){
			for(String j:sel2){
				r.rsp_Game(i,j);
			}
		}
	}
}