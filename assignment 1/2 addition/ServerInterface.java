import java.rmi.*;

public interface ServerInterface extends Remote {

	public double add(double x, double y) throws RemoteException;
}
