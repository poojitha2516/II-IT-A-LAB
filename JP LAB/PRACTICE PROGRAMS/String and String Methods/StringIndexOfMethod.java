// String method : indexof method

public class Example5 {
	public static void main(String[] args) {
		String s1 = "Java Programming Language";
		int result;
		
		result = s1.indexOf('L');
		System.out.println(result);
		//Repeated letter
		result = s1.indexOf('a');
		System.out.println(result);
		//Not in the string
		result = s1.indexOf('z');
		System.out.println(result);
		
	}
}
