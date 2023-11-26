package application.Employee.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import application.database.operations.operation;
import employee.related.data.EmployeeDetails;

public class Employee {

	public static void main(String[] args) throws IOException {
		
			@SuppressWarnings("resource")
			AnnotationConfigApplicationContext iocContainer = new AnnotationConfigApplicationContext() ;
			iocContainer.scan("application.database.*","application.related.data.*");
			iocContainer.refresh();
			
			EmployeeDetails EmpDetail = (EmployeeDetails) iocContainer.getBean("employeeDetails");
			operation operation = (operation) iocContainer.getBean(operation.class);
			BufferedReader takeInput = new BufferedReader(new InputStreamReader(System.in));
			boolean condition = true;
			while(condition){
			System.out.println("What you want to do\n"
					+"1. Insert Employee Detail\n"
					+"2. Delete the Employee\n"
					+"3. Update employee data\n"
					+"4. Print All Employee Data\n"
					+"5. Print Perticular employee data\n"
					+"6. quit");
			switch(takeInput.readLine()) {
			case "1":
				System.out.println("Enter Employee ID");
				EmpDetail.setEmpID(Integer.parseInt(takeInput.readLine()));
				System.out.println("Enter Employee Name");
				EmpDetail.setFullName(takeInput.readLine());
				System.out.println("Enter Employee Address");
				EmpDetail.setAddress(takeInput.readLine());
				int status = operation.addEmployee(EmpDetail);;
				if(status>0) {
					System.out.println("insertion successfully");	
				}else {
					System.out.println("insertion failed");
				}
				break;
			case "2":
				System.out.println("Enter the Employee ID for Delete");
				int status1 = operation.deleteEmployee(takeInput.readLine());
				if(status1>0) {
					System.out.println("deletation successfully");
				}else {
					System.out.println("deletation failed");
				}
				break;
			case "3":
				System.out.println("What you want to Update:\n"
						+ "1. Name\n"
						+ "2. Address\n"
						+ "3. Quit\n");
				
				String optionSelected = takeInput.readLine();
				if(optionSelected.equals("1")) {
					System.out.println("Enter Employee Id for Update detail");
					String id = takeInput.readLine();
					System.out.println("Enter Correct Employee Name for Update detail");
					String name = takeInput.readLine();
					operation.updateEmployeeName(id,name);
					
					
				}else if(optionSelected.equals("2")){
					System.out.println("Enter Employee Id for Update detail");
					String id = takeInput.readLine();
					System.out.println("Enter Correct Employee Name for Update detail");
					String address = takeInput.readLine();
				operation.updateEmployeeAddress(id, address);
				}else{
					break;
				}
				break;
			case "4":
				System.out.println("All Employee Data");
				operation.allEmployees();
				break;
			case "5":
				System.out.println("single Employee Data");
				System.out.println("Enter Employee id");
				operation.particularEmployee(takeInput.readLine());
				break;
			case "6":
				System.out.print("Exiting the operation");
				condition=false;
				break;
			}
			}
		
		
	}

}
