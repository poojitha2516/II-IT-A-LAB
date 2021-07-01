// Classes and objects
import java.util.Scanner;
class Employee {
	String name;
	int id;
	int salary;
	
	void show() {
		System.out.println();
		System.out.println("---------Details Of Employee------------");
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Salary: "+salary);

    }
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Enter Employee Name : ");
		employee.name = sc.nextLine();
		System.out.print("Enter Employee ID: ");
		employee.id = sc.nextInt();
		System.out.print("Enter Employee Salary : ");
		employee.salary = sc.nextInt();
		
		employee.show();
	}
    
}

