
public class Manager extends Employee {
	
	String department;

	public Manager(String firstName, String lastName, int employeeID, String department) {
		super(firstName, lastName, employeeID);
		
		this.department = department;
	}
	
	@Override
	public void employeeSummary() {
		System.out.println("Manager");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Salary: " + salary);
		System.out.println("Department: " + department);
		System.out.println(); // Line break
	}

}
