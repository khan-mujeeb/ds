import java.rmi.*;

public interface ServerInterface extends Remote{
	public double sqRoot(double num) throws RemoteException;
}
