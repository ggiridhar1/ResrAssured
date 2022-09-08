package pojoClassSerialisationAndDeserialisation;

public class Employee {
String empname;
String empId;
String email;
long Phoneno;
public Employee(String empname, String empId, String email, long phoneno) {
	super();
	this.empname = empname;
	this.empId = empId;
	this.email = email;
	Phoneno = phoneno;
}
public Employee()
{
	}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhoneno() {
	return Phoneno;
}
public void setPhoneno(long phoneno) {
	Phoneno = phoneno;
}

}
