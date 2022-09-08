package pojoClassSerialisationAndDeserialisation;

public class HusbandEmp {
String empname;
String empid;
long phoneNo;
String email;
Object Spouse;
public HusbandEmp(String empname, String empid, long phoneNo, String email, Object Spouse) {
	super();
	this.empname = empname;
	this.empid = empid;
	this.phoneNo = phoneNo;
	this.email = email;
	this.Spouse=Spouse;
}
public HusbandEmp() {}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpid() {
	return empid;
}
public void setEmpid(String empid) {
	this.empid = empid;
}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}
