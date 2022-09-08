package pojoClassSerialisationAndDeserialisation;

public class EmployeeArray {
String [] empnameA;
String  empIdA;
String [] mailIdA;
long[] phonenoA;
public EmployeeArray(String[] empnameA, String empIdA, String[] mailIdA, long[] phonenoA) {
	super();
	this.empnameA = empnameA;
	this.empIdA = empIdA;
	this.mailIdA = mailIdA;
	this.phonenoA = phonenoA;
}
public EmployeeArray() {}
public String[] getEmpnameA() {
	return empnameA;
}
public void setEmpnameA(String[] empnameA) {
	this.empnameA = empnameA;
}
public String getEmpIdA() {
	return empIdA;
}
public void setEmpIdA(String empIdA) {
	this.empIdA = empIdA;
}
public String[] getMailIdA() {
	return mailIdA;
}
public void setMailIdA(String[] mailIdA) {
	this.mailIdA = mailIdA;
}
public long[] getPhonenoA() {
	return phonenoA;
}
public void setPhonenoA(long[] phonenoA) {
	this.phonenoA = phonenoA;
}

}
