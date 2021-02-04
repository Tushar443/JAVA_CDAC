
public class Occuring_String {
	public static void main(String[] args) {
		System.out.println("Ocuurance is === "+findOccuring("jjvvvjjaaajjavavvv"));
	}
	
	public static char findOccuring(String s) {
		

		char myString[] =s.toCharArray();
		int max = 0,count = 0;
		char maxocu = '\0';
		char a = '\0';
		for(int i = 0 ;i < myString.length-1;i++) {
			a=myString[i];
			count= 0;
			//System.out.println("a = "+a);
			for(int j = i+1 ;j<myString.length;j++) {
				if(a ==myString[j]) {
					
					count++;
					//System.out.println("count = "+count+" "+j+ " "+i);
				}
				
				if(count >max) {
					max =count;
					maxocu = a;
				}
			
		}
		//System.out.println("max is "+max);

		}
		
		return maxocu;
	}

}