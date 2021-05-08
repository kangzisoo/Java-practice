package 상속;

public class Employee {
	public String name;
	String address;
	protected int salary;
	private int rrn; //주민번호
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", rrn=" + rrn + ", salary=" + salary + "]";
	}
	
}
