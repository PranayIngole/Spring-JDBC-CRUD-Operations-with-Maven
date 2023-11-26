package application.database.connection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import employee.related.data.EmployeeDetails;
@Configuration
public class DbDetails {
	// database connection code
		@Bean
		public JdbcTemplate getJdbcTemplate() {
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setUrl("jdbc:mysql://localhost:3306/spring");
			dataSource.setUsername("root");
			dataSource.setPassword("Pranay8#7#2&1");
			return new JdbcTemplate(dataSource);
		}
		
		@Bean("employeeDetails")
		public EmployeeDetails getEmployeeDetails() {
			return new EmployeeDetails();
			
		}
}
