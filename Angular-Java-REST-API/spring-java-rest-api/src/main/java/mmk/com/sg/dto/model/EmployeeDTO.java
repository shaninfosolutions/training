package mmk.com.sg.dto.model;

public class EmployeeDTO {

	private String empId;
	
	private String name;
	
	private String designation;
	
	private double salary;
	
	

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + empId + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	
	
	
}