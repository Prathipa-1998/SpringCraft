package in.co.gradle.springCrud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String empname;
	private String empAddress;
	private float salary;
	private long mobnum;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public long getMobnum() {
		return mobnum;
	}
	public void setMobnum(long mobnum) {
		this.mobnum = mobnum;
	}
	public Employee(long id, String empname, String empAddress, float salary, long mobnum) {
		super();
		this.id = id;
		this.empname = empname;
		this.empAddress = empAddress;
		this.salary = salary;
		this.mobnum = mobnum;
	}
	
	public Employee()
	{
		
	}


}
