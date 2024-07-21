
public class Main {

	public static void main(String[] args) {
		
		Employee e = new Employee("John", "Smith", 1234);
		e.employeeSummary();
		
		Manager m = new Manager("Chris", "Johnson", 5678, "HR");
		m.employeeSummary();
	}

}
