import java.rmi.*;

interface ServerIntf extends Remote{
		public String reverse2(String str) throws RemoteException; 
}
