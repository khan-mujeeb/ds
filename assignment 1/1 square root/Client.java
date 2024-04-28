import java.rmi.*;

class Client {

	public static void main(String args[]) {
		
		try {
			
			double num = 96;
			String url = "rmi://localhost/server";
			ServerInterface serverInt = (ServerInterface) Naming.lookup(url);
			
			System.out.println("square root of " + num + "is " + serverInt.sqRoot(num));
			
		} catch (Exception e ) {
			System.out.println(e);
		}
	
	}
}
