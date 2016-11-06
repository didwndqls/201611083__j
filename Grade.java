public class Grade {
	private char grade;
	public char resultGrade(double score){
		if(90< score&&score <=100) {
			grade = 'A';
			return grade;
		}
		else if(80< score&&score <=90){
			grade = 'B';
			return grade;
		}
		else if(70< score&&score <=80){
			grade = 'C';
			return grade;
		}
		else if(60< score&&score <=70){
			grade = 'D';
			return grade;
		}
		else if(score<=60){
			grade = 'F';
			return grade;
		}
		else {
			grade ='x';
			return grade;
		}
	}
	public void setGrade(char s){
		System.out.printf("your garde is : %c\n",s);
	}
	public static void main(String[] args){
		Grade g1 = new Grade();
		double[] g ={95.3,89.1,65.9,74.1,58.0};
		for(double i:g){
			char s = g1.resultGrade(i);
			g1.setGrade(s);
		}
	}
}