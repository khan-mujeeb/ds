import java.rmi.*;
import java.rmi.server.*;

public class ServerImplement extends UnicastRemoteObject implements ServerInterface {
	
	public ServerImplement() throws RemoteException {
	
	}
	
	public double sqRoot(double num) {
		return Math.sqrt(num);
	}
}
