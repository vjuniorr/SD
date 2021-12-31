

import java.rmi.Remote;

public interface ICalculadora extends Remote {
    
    int somar(int a, int b) throws java.rmi.RemoteException;
    int subtrair(int a, int b) throws java.rmi.RemoteException;
    int multiplicar(int a, int b) throws java.rmi.RemoteException;
    double dividir(int a, int b) throws java.rmi.RemoteException;
}
