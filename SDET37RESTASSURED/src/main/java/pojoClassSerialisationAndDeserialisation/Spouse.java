package pojoClassSerialisationAndDeserialisation;

public class Spouse {
String sname;
int age;
String emailId;
long phoneno;
public Spouse(String sname, int age, String emailId, long phoneno) {
	super();
	this.sname = sname;
	this.age = age;
	this.emailId = emailId;
	this.phoneno = phoneno;
}
public Spouse() {}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
}
}
