class Mul_And_Sum{ 
 	int sum = 0; 
 	void calc(int start, int end){ 
 		for(int i=start; i<end; i++){ 
 			if(i%3==0 || i%5==0) { 
 				sum = sum + i; 
 			} 
 		} 
 		System.out.printf("The sum of a multiple of 3 and 5 is : %d\n", sum); 
 	} 
 	public static void main(String[] args){ 
 		Mul_And_Sum m = new Mul_And_Sum(); 
 		int start = 1; 
 		int end = 1000;
 		m.calc(start,end); 
 	} 
 } 