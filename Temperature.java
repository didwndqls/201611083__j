public class Temperature{
	private double f =0;
	private double c =0;
	public void convert_temperature(double temp, String t){
    if ( t == "C") {
      System.out.printf("Input your Celsius is %.2f %s\n",temp,t);
      f = (temp*1.8)+32;
      System.out.printf("Converted Fahrenheit is %.2f F\n",f);
    }
    else if ( t == "F") {
      System.out.printf("Input your Fahrenheit is %.2f %s\n",temp,t);
      c = (temp-32)/1.8;
      System.out.printf("Converted Celsius is %.2f C\n",c);
    }
    }
	public static void main(String[] args) {
		Temperature te = new Temperature();
		double temp = 36.5;
		String t = "C";
		te.convert_temperature(temp,t);
		temp = 97.7;
		t= "F";
		te.convert_temperature(temp,t);
	}
}