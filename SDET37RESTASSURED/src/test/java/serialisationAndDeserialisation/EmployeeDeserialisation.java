package serialisationAndDeserialisation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoClassSerialisationAndDeserialisation.Employee;

public class EmployeeDeserialisation {
public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
	//create object for object mapper
	ObjectMapper desreial = new ObjectMapper();
	//use read value
	Employee employeedes = desreial.readValue(new File("./employe.json"), Employee.class);
	System.out.println(employeedes.getEmpname());
	System.out.println(employeedes.getEmpId());
	System.out.println(employeedes.getEmail());
	System.out.println(employeedes.getPhoneno());
}
}
