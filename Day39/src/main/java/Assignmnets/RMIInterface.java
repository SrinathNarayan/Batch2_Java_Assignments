package Assignmnets;

import java.rmi.RemoteException;
import java.rmi.Remote;

public interface RMIInterface extends Remote {

    public String helloTo(String name) throws RemoteException;

}

