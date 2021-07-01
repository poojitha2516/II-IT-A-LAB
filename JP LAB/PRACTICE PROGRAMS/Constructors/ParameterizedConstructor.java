//Parameterized Constructor

public class StudentDetails {
	int rollnum;
	String name;
	
	StudentDetails(int r,String n) {  //Creating parameterized constructor
		rollnum = r;
		name = n;
	}
	
	void show() {
		System.out.println("Roll Num : " + rollnum);
		System.out.println("Name : " + name);
		System.out.println("--------------------------");
	}
	
	public static void main(String args[]) {
		StudentDetails s1 = new StudentDetails(30,"Poojitha");
		StudentDetails s2 = new StudentDetails(42,"Sriya");
		StudentDetails s3 = new StudentDetails(28,"Aparna");
		
		s1.show();
		s2.show();
		s3.show();
	}
}
