// String methods : Compare method

public class Example2 {
	public static void main(String[] args) {
		String s1 = "I like eating food";
		String s2 = "I like dresses";
		String s3 = "I like eating food";
		int result;
		
		result = s1.compareTo(s2);//comparing s1 with s2
		System.out.println(result);
		
		result = s1.compareTo(s3);//comparing s1 with s3
		System.out.println(result);
		
		result = s3.compareTo(s2);//comparing s3 with s2
		System.out.println(result);
	}
} 
