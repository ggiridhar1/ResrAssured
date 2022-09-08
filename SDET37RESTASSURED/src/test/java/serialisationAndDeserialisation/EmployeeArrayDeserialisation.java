package serialisationAndDeserialisation;

import java.io.File;
import org.codehaus.jackson.map.ObjectMapper;

import pojoClassSerialisationAndDeserialisation.EmployeeArray;

public class EmployeeArrayDeserialisation {
public static void main(String[] args) throws Throwable  {
	ObjectMapper objectMapper=new ObjectMapper();
	EmployeeArray value = objectMapper.readValue(new File("./employeearray.json"), EmployeeArray.class);
	for (int i = 0; i < 2; i++) {
		System.out.println(value.getEmpnameA()[i]);
		System.out.println(value.getMailIdA()[i]);
		System.out.println(value.getPhonenoA()[i]);
	}
	System.out.println(value.getEmpIdA());
}
}
