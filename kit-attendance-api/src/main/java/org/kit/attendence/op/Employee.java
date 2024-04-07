package org.kit.attendence.op;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Emp_id;
    private String Emp_name;
    private String Role;
    private String Department;
    private String DOJ;
    private String Status;
    private String Log_In;
    private String Log_Out;
    private String Work_Hours;
    
    
    public Employee() {
        // Empty constructor required by JPA
    }
    
	public Employee(Long emp_id, String emp_name, String role, String department, String dOJ, String status,
			String log_In, String log_Out, String work_Hours) {
		Emp_id = emp_id;
		Emp_name = emp_name;
		Role = role;
		Department = department;
		DOJ = dOJ;
		Status = status;
		Log_In = log_In;
		Log_Out = log_Out;
		Work_Hours = work_Hours;
	}
	public Long getEmp_id() {
		return Emp_id;
	}
	public void setEmp_id(Long emp_id) {
		Emp_id = emp_id;
	}
	public String getEmp_name() {
		return Emp_name;
	}
	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getDOJ() {
		return DOJ;
	}
	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getLog_In() {
		return Log_In;
	}
	public void setLog_In(String log_In) {
		Log_In = log_In;
	}
	public String getLog_Out() {
		return Log_Out;
	}
	public void setLog_Out(String log_Out) {
		Log_Out = log_Out;
	}
	public String getWork_Hours() {
		return Work_Hours;
	}
	public void setWork_Hours(String work_Hours) {
		Work_Hours = work_Hours;
	}
    
    
    
}