package homework;

public class PrimitiveTypeConversion2 {
	public static void main(String[] args) {
		short a = 69;
		byte b = (byte)a;
		System.out.println(b);
		
	     short a2 = 589;
	     byte b2 = (byte)a2;
	     System.out.println(b2);
	     
	     long a3 = 485l;
	     int b3 = (int)a3;
	     System.out.println(b3);
	     
	     long a4 = 52523635483l;
	     int b4 = (int)a4;
	     System.out.println(b4);
	     
	     double a5 = 5632.6d;
	     float b5 = (float)a5;
	     System.out.println(b5);
	     
	     char a6 = 'D';
	     int b6 = (int)a6;
	     System.out.println(b6);
	     
	     int a7 = 123;
	     char b7 = (char)a7;
	     System.out.println(b7);
	}
}
