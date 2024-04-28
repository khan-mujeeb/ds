import java.rmi.*;
import java.rmi.server.*;

public class ServerImplement extends UnicastRemoteObject implements ServerInterface {

	public ServerImplement() throws RemoteException {
	
	}
	
	public double add(double x, double y)  {
	
		return x + y;
	}
	
	
}
