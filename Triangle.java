class Triangle {
  void drawTriangleSymbol(){
  StringBuffer sbuf = new StringBuffer();
  String white =" ";
  String s="#";
  for (int i=0; i<6; i++ ) {
         for(int j=0;j<6-i;j++){
            sbuf.append(white);
         }
         for (int j=0; j<i*2+1; j++ ) {
            sbuf.append(s);
         }
         System.out.printf("%s\n",sbuf.toString());
         sbuf.delete(0,sbuf.length());
      }
   }
   public static void main(String[] args) {
   Triangle a = new Triangle();
   a.drawTriangleSymbol();
   }
}