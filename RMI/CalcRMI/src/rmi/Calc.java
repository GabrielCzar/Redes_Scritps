package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calc extends Remote {
    public String sayHello() throws RemoteException;

    public double mul(double n1, double n2) throws RemoteException;

    public double sum(double n1, double n2) throws RemoteException;

    public double sub(double n1, double n2) throws RemoteException;

    public double div(double n1, double n2) throws RemoteException;
}
