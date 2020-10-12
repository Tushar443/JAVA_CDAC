public class Q53String {
	public static void main(String[] args) {
		int sum =0;
		String s ="67,89,23,67,12,55,66";
		String arr[]=s.split(",");
		for(String s3 : arr) {
			sum =sum+ Integer.parseInt(s3);
		}
		System.out.println(sum);
	}
}
