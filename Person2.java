class Person2{ 
 	double bmi=0; 
 	double calc(double weight, double height){ 
 		bmi=weight/(height*height/10000); 
 		return bmi; 
 	} 
 	void bmiResult(double bmi){ 
 		if(bmi<18.5) { 
 			System.out.printf("Your BMI result is %.1f and You are low",bmi); 
 		} 
 		else if(bmi>=18.5 && bmi<23) { 
 			System.out.printf("Your BMI result is %.1f and You are nomal ",bmi); 
 		} 
 		else if(bmi>=23 && bmi<25) { 
 			System.out.printf("Your BMI result is %.1f and You are resky ",bmi); 
 		} 
 		else if(bmi>=25 && bmi<30) { 
 			System.out.printf("Your BMI result is %.1f and You are obesity 1 ",bmi);
 		} 
 		else if(bmi>=30 && bmi<40) { 
 			System.out.printf("Your BMI result is %.1f and You are obesity 2 ",bmi);
 		} 
 		else if(bmi>=40) { 
 			System.out.printf("Your BMI result is %.1f and You are obesity 3 ",bmi);
 		} 
 		else { 
 			System.out.print("Error"); 
 		} 
 	} 
 	public static void main(String[] args){ 
 		Person2 p = new Person2(); 
 		double result = p.calc(70,180); 
 		p.bmiResult(result); 
 	} 
 } 