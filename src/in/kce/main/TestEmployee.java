package in.kce.main;

import java.util.ArrayList;
import java.util.Scanner;

import in.kce.bean.Employee;
import in.kce.service.EmployeeService;

public class TestEmployee {
public static void main(String[] args) {
	//switch for menu
	System.out.println("\nEmployee Management");
	System.out.println("1. Store Employee");
	System.out.println("2. Update Employee");
	System.out.println("3. Fetch One Employee");
	System.out.println("4. Fetch All Employees");
	System.out.println("5. Delete Employee");
	System.out.print("Enter Choice: ");
	int option=new Scanner(System.in).nextInt();
	switch (option) {
	case 1: {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Employee Id:");
	    int empId = sc.nextInt();
	    sc.nextLine();
	    System.out.println("Enter Employee Name:");
	    String empName = sc.nextLine();
	    System.out.println("Enter Designation:");
	    String desig = sc.nextLine();
	    EmployeeService employeeService = new EmployeeService();
	    boolean result =employeeService.saveEmployee(empId, empName, desig);
	    if(result) {
	        System.out.println("Employee Saved Successfully");
	    } else {
	        System.out.println("Employee Not Saved");
	    }

	    break;
	}
	case 2:{
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter Employee Id:");
	    int empId = sc.nextInt();
	    sc.nextLine();

	    System.out.println("Enter New Employee Name:");
	    String empName = sc.nextLine();

	    EmployeeService employeeService = new EmployeeService();

	    boolean result = employeeService.updateEmployee(empId, empName);

	    if(result) {
	        System.out.println("Employee Updated Successfully");
	    }
	    else {
	        System.out.println("Employee Not Updated");
	    }

	    break;
	}
	case 3:{
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter Employee Id:");
	    int empId = sc.nextInt();

	    EmployeeService employeeService = new EmployeeService();

	    Employee emp = employeeService.getEmployee(empId);

	    if(emp != null) {
	        System.out.println("Employee Id: " + emp.getEmpId());
	        System.out.println("Employee Name: " + emp.getEmpName());
	        System.out.println("Designation: " + emp.getDesignation());
	    }
	    else {
	        System.out.println("Employee Not Found");
	    }

	    break;
	}
	case 4:{
	    EmployeeService employeeService = new EmployeeService();

	    ArrayList<Employee> employees =
	            employeeService.getAllEmployees();

	    for(Employee emp : employees) {
	        System.out.println("Employee Id : " + emp.getEmpId());
	        System.out.println("Employee Name : " + emp.getEmpName());
	        System.out.println("Designation : " + emp.getDesignation());
	        System.out.println("-------------------");
	    }

	    break;
	}
	case 5:{
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter Employee Id:");
	    int empId = sc.nextInt();

	    EmployeeService employeeService = new EmployeeService();

	    boolean result = employeeService.deleteEmployee(empId, null);

	    if(result) {
	        System.out.println("Employee Deleted Successfully");
	    }
	    else {
	        System.out.println("Employee Not Deleted");
	    }

	    break;
	}
	default:
		throw new IllegalArgumentException("Unexpected value: " + option);
	}
	
}
}
