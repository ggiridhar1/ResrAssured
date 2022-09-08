package serialisationAndDeserialisation;

import java.io.File;
import org.codehaus.jackson.map.ObjectMapper;

import pojoClassSerialisationAndDeserialisation.Employee;

public class EmployeeSerialisation {
	public static void main(String[] args) throws Throwable {
		//create an object for Pojo class
		Employee emp=new Employee("v.s.giridhar","tyss123456","ggiridhar91@gmail.com",9003181007L);
		//Create an for object mapper
		ObjectMapper objectmap = new ObjectMapper();
		//use write value
		objectmap.writeValue(new File("./employe.json"), emp);
	}
}