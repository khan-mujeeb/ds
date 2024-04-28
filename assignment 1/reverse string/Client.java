import java.rmi.*;



	public class Client {

	public static void main(String args[]) {
		try {
			String url = "rmi://localhost/server";
		
			ServerIntf serverIntf = (ServerIntf) Naming.lookup(url);
		
			System.out.println("reversed string is" + serverIntf.reverse2("mujeeeb"));
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}
