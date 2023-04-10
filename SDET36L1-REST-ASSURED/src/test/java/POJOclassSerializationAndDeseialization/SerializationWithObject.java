package POJOclassSerializationAndDeseialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class SerializationWithObject {
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		int[] phno= {123,345};
		Spouse sp =new Spouse("sss","sss");
		
EmpolyeWithObject emp = new EmpolyeWithObject("kartik","ty123",phno,sp);

ObjectMapper omap =new ObjectMapper();

omap.writeValue(new File("./file2.json"),emp);
	}

}
