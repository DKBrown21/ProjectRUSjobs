package com.skillstorm.general;
/*-	Jobs should have:
o	An Id
o	A title
o	A description
o	A street address
o	A city
o	A state
o	A zipcode
o	A salary
o	A field
o	A contact email

 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Jobs {
private String id;
private String title;
private String description;
private String streetAddress;
private String city;
private String state;
private String zipcode;
private double salary; 
private String field;
private String email;

public Jobs(String id, String title, String streetAddress, String city, String state, String zipcode, String field, double salary, String email,
			String description ) {
	this.id = id;
	this.title = title;
	this.streetAddress = streetAddress;
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
	this.salary = salary;
	this.field = field;
	this.email = email;
	this.description = description;
	
}
public Jobs() {}

public String getId() {
	return this.id;
}
public void setId(String id) {
	this.id = id;
}
public String getTitle() {
	return this.title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return this.description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getStreetAddress() {
	return this.streetAddress;
}
public void setStreetAddress(String streetAddress) {
	this.streetAddress = streetAddress;
}
public String getCity() {
	return this.city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return this.state;
}
public void setState(String state) {
	this.state= state;
}
public String getZipcode() {
	return this.zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}
public double getSalary() {
	return this.salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getField() {
	return this.field;
}
public void setField(String field) {
	this.field = field;
}
public String getEmail() {
	return this.email;
}
public void setEmail(String email) {
	this.email = email;
}
}