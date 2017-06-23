import java.net.InetAddress;
import java.net.UnknownHostException;

public class Example {

	public static void main(String[] args) throws UnknownHostException {
		new Example().run();
	}
	
	private void run() throws UnknownHostException {
		System.out.println("java version is " + System.getProperty("java.version"));
		System.out.println("user name is " + System.getProperty("user.name"));
		System.out.println("host name is " + InetAddress.getLocalHost().getHostName());	
		
	}
}
