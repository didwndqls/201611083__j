import java.util.*;

public class P14_Student{
	private String name;
	private int studentNum;
	P14_Student(String name, int sNum){
		this.name = name;
		studentNum = sNum;
	}
	public String getName(){
		return name;
	}

	public static void main(String[] args){
		ArrayList<String> studentNameList = new ArrayList<String>();
		P14_Student s1 = new P14_Student("jb 1",1000);
		P14_Student s2 = new P14_Student("jb 3",3000);
		P14_Student s3 = new P14_Student("jb 5",5000);
		P14_Student s4 = new P14_Student("jb 2",2000);
		P14_Student s5 = new P14_Student("jb 4",4000);
		studentNameList.add(s1.getName());
		studentNameList.add(s2.getName());
		studentNameList.add(s3.getName());
		studentNameList.add(s4.getName());
		studentNameList.add(s5.getName());
		Collections.sort(studentNameList);
		System.out.println(studentNameList);
	}
}