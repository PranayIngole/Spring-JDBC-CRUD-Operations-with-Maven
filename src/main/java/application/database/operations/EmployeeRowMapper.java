package application.database.operations;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import employee.related.data.EmployeeDetails;

public class EmployeeRowMapper implements RowMapper<EmployeeDetails> {
	//making One Object for EmployeeDetail we getting from database and sending to the operation
	public EmployeeDetails mapRow(ResultSet rs, int arg1 ) throws SQLException {
		EmployeeDetails emp = new EmployeeDetails();
		emp.setEmpID(rs.getInt("Emp_ID"));
		emp.setFullName(rs.getString("FullName"));
		emp.setAddress(rs.getString("Address"));
		return emp;	
	}
}

