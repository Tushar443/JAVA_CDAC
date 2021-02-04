package practice;

public class Delete_Occurance {

	public static void main(String[] args) {
		findOccuring("java");

	}
public static void findOccuring(String s) {
		

		char myString[] =s.toCharArray();
		char dumyArray [] = new char[4];
		int max = 0,count = 0;
		char maxocu = '\0';
		char a = '\0';
		dumyArray[0]=myString[0];
		for(int i = 0 ;i<myString.length;i++) {
			
			for(int j = 0 ;j<dumyArray.length;j++) {
				if(dumyArray[j]!=myString[i]) {
					dumyArray[j]=myString[i];
				}
			}
			
		}
		System.out.println("Deleting "+dumyArray);
		
	}
	
}
