import org.apache.camel.Exchange;

public class test {

	public static void main(String[] args) {
	try {
		String test = null;
	test = checkUUID(null);
	System.out.println(test);
	}catch(Exception e){
		System.out.println(e);

	}
		
	}

	public static String checkUUID(String UUID) {
try {
return !(UUID.equalsIgnoreCase(null)) ? "true" : "false";
}catch(Exception e) {
	return "false";
}
	
	
	}
}
