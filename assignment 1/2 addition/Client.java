import java.rmi.*;

class Client {

	public static void main(String args[]) {
		
		try {
			
			double x = 5, y = 63.4;
			String url = "rmi://localhost/server";
			ServerInterface serverIntf = (ServerInterface)Naming.lookup(url);
			
			System.out.println("Sum of two number is " + serverIntf.add(x, y));
			
		} catch(Exception e ) {
			
			System.out.println(e);	
			
		}
	
	}
}
