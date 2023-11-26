package application.database.operations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import employee.related.data.EmployeeDetails;

@Component
public class operation {
	
	public operation() {
	}
	// Connecting to database
	@Autowired
	JdbcTemplate jdbcTemplete;
	//insert operation
	public int addEmployee(EmployeeDetails emp) {
		String query = "insert into employee values( " + emp.getEmpID() + ",'" + emp.getFullName() + "','"
				+ emp.getAddress() + "')";
				
		return jdbcTemplete.update(query);
	}
	//Delete operation
	public int deleteEmployee(String id) {
		String query = "delete from employee where Emp_ID ='" + id+"'";

		return jdbcTemplete.update(query);
	}
	// update operation for Name
	public boolean updateEmployeeName(String id,String FullName) {
		String query = "update employee set FullName = '"+FullName + " 'where Emp_ID = '" + id+"'";
		int status = jdbcTemplete.update(query);
		if(status>0) {
			System.out.println("Name is updated successfully");
			return true;	
		}else {
			System.out.println("Name is updated failed");
			return false;
		}
		
	}
	//update operation for Address
	public boolean updateEmployeeAddress(String id,String Address) {
		String query = "update employee set Address = '"+Address + "' where Emp_ID ='" + id+"'";

		int status = jdbcTemplete.update(query);
		if(status>0) {
			System.out.println("Address is updated successfully");
			return true;	
		}else {
			System.out.println("Address is updation failed");
			return false;
		}
	}
	//Getting all Employee data
	public void allEmployees() {
		String allEmployeeDetails = " select * from employee";
		List<EmployeeDetails> allEmployee = jdbcTemplete.query(allEmployeeDetails, new EmployeeRowMapper());
		for (EmployeeDetails e : allEmployee) {
			System.out.print(e.getEmpID() + "   ");
			System.out.print(e.getFullName() + "   ");
			System.out.print(e.getAddress() + "   ");
			System.out.println();
		}
	}
	//Getting single Employee data
	public void particularEmployee(String id) {
		String EmployeeDetails = " select * from employee where Emp_ID="+id;
		List<EmployeeDetails> singleEmployee = jdbcTemplete.query(EmployeeDetails, new EmployeeRowMapper());
		for(EmployeeDetails e : singleEmployee) {
			System.out.print(e.getEmpID() + "   ");
			System.out.print(e.getFullName() + "   ");
			System.out.print(e.getAddress() + "   ");
			System.out.println();
		}
	}
}

