// Keyword : static

class Friends {
	String name;
	int rollno;
	static String college = "BVRITH";  // Static variable
	
	Friends(String n,int r) {
		name = n;
		rollno = r;
	}
	
	void show() {
		System.out.println("Name : "+name);
		System.out.println("Rollnum : "+rollno);
		System.out.println("College : "+college);
		System.out.println("------------------------");
	}
}

public class Person4 {
	public static void main(String args[]) {
		Friends f1 = new Friends("Sriya",42);
		Friends f2 = new Friends("Aparna",28);
		
		f1.show();
		f2.show();
	}
}
