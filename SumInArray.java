import java.util.ArrayList;

public class SumInArray{
	private int sum = 0;
	private ArrayList<Integer> list = new ArrayList<Integer>();
	public ArrayList<Integer> input_Array(int start, int end){
		for(int i=start;i<end+1;i++){
			if(i%4==0&&i%5!=0){
				list.add(i);
			}
		}
		System.out.println(list);
		return list;
	}
	public void sum_Array(ArrayList<Integer> list){
		for(int i=0;i<list.size();i++){
			sum = sum+list.get(i);
		}
		System.out.printf("total sum is : %d",sum);
	}
	public static void main(String[] args){
		SumInArray s = new SumInArray();
		int start = 1;
		int end = 1000;
		ArrayList<Integer> list = s.input_Array(start, end);
		s.sum_Array(list);
	}
}