
import java.rmi.server.UnicastRemoteObject;

public class Calculadora extends UnicastRemoteObject implements ICalculadora {

    private static final long serialVersionUID = 1L;

    public Calculadora() throws java.rmi.RemoteException {
        // super();
    }

    public int somar(int a, int b) throws java.rmi.RemoteException {
        return a + b;
    }

    public int subtrair(int a, int b) throws java.rmi.RemoteException {
        return a - b;
    }

    public int multiplicar(int a, int b) throws java.rmi.RemoteException {
        return a * b;
    }

    public double dividir(int a, int b) throws java.rmi.RemoteException {
        return (double) a / b;
    }

}
