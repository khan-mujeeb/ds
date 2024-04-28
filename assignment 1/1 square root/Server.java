import java.rmi.*;

class Server {

	public static void main(String args[]) {
		
		try {
			
			ServerImplement server = new ServerImplement();
			
			Naming.rebind("server", server);			
			
		} catch (Exception e) {
			System.out.println(e);
		}	
		
	}
}
