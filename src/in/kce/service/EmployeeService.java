package in.kce.service;
import java.util.ArrayList;
import in.kce.bean.Employee;
import in.kce.dao.EmployeeDAO;

public class EmployeeService {
	EmployeeDAO empdao;	
	public boolean saveEmployee(int empId,String empName,String desig) {
		Employee emp=new Employee();
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		emp.setDesignation(desig);
		boolean result=new EmployeeDAO().saveEmployee(emp);
		return result;
	}
	public boolean updateEmployee(int empId,String empName) {
		Employee emp=new Employee();
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		boolean result=new EmployeeDAO().updateEmployee(emp);
		return result;
	}
	public boolean deleteEmployee(int empId,String empName) {
		Employee emp=new Employee();
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		boolean result=new EmployeeDAO().deleteEmployee(String.valueOf(empId));
		return result;
	}
	public Employee getEmployee(int empId) {
	    Employee employee =new EmployeeDAO().getEmployee(String.valueOf(empId));
	    return employee;
	}
	public ArrayList<Employee> getAllEmployees() {

	    return new EmployeeDAO().getAllEmployees();
	}
	
	
}
