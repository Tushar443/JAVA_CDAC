public class Casting {
	public static void main (String [] args){
		byte b1= 'a';
		short s1 ='b';
		int i1='c';
		long l1= 'd';
		float f1='e';
		double d1 ='f';
		
		
		char b=(char)b1;
		short s =s1;
		int i=i1;
		long l=l1;
		float f=f1;
		double d =d1;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
	}
}