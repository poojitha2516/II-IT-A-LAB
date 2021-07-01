// Copy Constructor

public class StudentDetails1 {
	int rollnum;
	String name;
	
	StudentDetails1(int r,String n) { 
		rollnum = r;
		name = n;
	}
	
	StudentDetails1(StudentDetails1 s) { // To initialize another object
		rollnum = s.rollnum;
		name = s.name;
	}
	
	void show() {
		System.out.println("Roll Num : " + rollnum);
		System.out.println("Name : " + name);
	}
	
	public static void main(String args[]) {
		StudentDetails1 s1 = new StudentDetails1(30,"Poojitha");
		StudentDetails1 s2 = new StudentDetails1(s1);
		
		s1.show();
		s2.show();
	}
}
