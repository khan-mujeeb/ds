import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImplement extends UnicastRemoteObject implements ServerIntf {

    public ServerImplement() throws RemoteException {
        super();
    }

    public String reverse2(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}

