package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
//@Table(name="Registration")

public class RegistrationIO {
	//Personal Details	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int empId;
	String firstName;   
	String middleName;
	String lastName;
	String DOB;
	String gender;
	
	//Office Details
	@Column
	String joiningDate;
	String department;
	String Designation;
	
	//Contact Details
	String email;
	String phoneNo;
	String alternatePhoneNo;
	
	//Address
	String address;
	String city;
	String state;
	int pinCode;
	
	//Default Password(By Admin)
	String password;
	String confirmPassword;
	
	
	
	//Default constructor 
	public RegistrationIO() {
		super();
	}
	
	
	//Parameterized Constructor
	public RegistrationIO(int empId, String firstName, String middleName, String lastName, String DOB, String gender,
			String joiningDate, String department, String Designation, String email, String phoneNo, String alternatePhoneNo,
			String address, String city, String state, int pinCode, String password, String confirmPassword) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.DOB = DOB;
		this.gender = gender;
		this.joiningDate = joiningDate;
		this.department = department;
		this.Designation = Designation;
		this.email = email;
		this.phoneNo = phoneNo;
		this.alternatePhoneNo = alternatePhoneNo;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	
	
	//Getters and Setters
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDOB() {
		return DOB;
	}


	public void setDOB(String DOB) {
		this.DOB = DOB;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getJoiningDate() {
		return joiningDate;
	}


	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getDesignation() {
		return Designation;
	}


	public void setDesignation(String Designation) {
		this.Designation = Designation;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getAlternatePhoneNo() {
		return alternatePhoneNo;
	}


	public void setAlternatePhoneNo(String alternatePhoneNo) {
		this.alternatePhoneNo = alternatePhoneNo;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getPinCode() {
		return pinCode;
	}


	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getConfirmPassword() {
		return confirmPassword;
	}


	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	//ToString Method
	@Override
	public String toString() {
		return "RegistrationIO [empId=" + empId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", DOB=" + DOB + ", gender=" + gender + ", joiningDate=" + joiningDate
				+ ", department=" + department + ", Designation=" + Designation + ", email=" + email + ", phoneNo="
				+ phoneNo + ", alternatePhoneNo=" + alternatePhoneNo + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", pinCode=" + pinCode + ", password=" + password + ", confirmPassword="
				+ confirmPassword + "]";
	}
	


}