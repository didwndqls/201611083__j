class LeapYear{ 
    void checkYear(int y){ 
       if(((y%4==0)&&(y%100!=0))||(y%400==0)){ 
          System.out.printf("%s is Leap Year\n",y); 
       } 
       else{ 
          System.out.printf("%s is not Leap Year\n",y);
       } 
    } 
    public static void main(String[] args){ 
       LeapYear l = new LeapYear(); 
       int[] years={1800,1900,1912,1984,1985,2000,2015,1825,1928,2031,1845,1947,2053,2099};
       for(int i:years){ 
          l.checkYear(i); 
       }  
    } 
 } 