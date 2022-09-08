package serialisationAndDeserialisation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoClassSerialisationAndDeserialisation.EmployeeArray;

public class EmployeeArraySerialisation {
public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
	String [] empnameA= {"arun","K"};
	String mpIdA= "Tyss12354";
	String []mailIdA= {"arunXXX@gmail.com","arunYYY@gmail.com"};
	long[] phonenoA= {9876543210L,1234567890};
	//create object of class
	EmployeeArray emp = new EmployeeArray(empnameA,mpIdA,mailIdA,phonenoA);
	//create an object of object mapper
	ObjectMapper objectmapper = new ObjectMapper();
	//use write value
	objectmapper.writeValue(new File("./employeearray.json"), emp);
}
}
