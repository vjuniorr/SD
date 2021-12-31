import java.io.IOException;
import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;

import javax.print.attribute.standard.MediaSize.NA;

public class ServerRMI {

    public static void main(String[] args) throws Exception {
        try {
            // Criar um objeto remoto para a interface ICalculadora
            ICalculadora calculadora = new Calculadora();
            // Exportar o objeto remoto para o sistema RMI
            String url = "rmi://localhost/Calculadora";

            System.out.println("Exportando objeto remoto para " + url + " ...");
            LocateRegistry.createRegistry(1099);
            Naming.rebind(url, calculadora);

            System.out.println("Aguardando conexões...");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static byte[] getRequest() throws Exception {
        // Receber a requisição do cliente
        // try {
        //     // Criar um objeto remoto para a interface ICalculadora
        //     ICalculadora calculadora = new Calculadora();
        //     // Exportar o objeto remoto para o sistema RMI
        //     String url = "rmi://localhost/Calculadora";

        //     System.out.println("Exportando objeto remoto para " + url + " ...");
        //     LocateRegistry.createRegistry(1099);
        //     Naming.rebind(url, calculadora);

        //     System.out.println("Aguardando conexões...");
        // } catch (Exception e) {
        //     System.out.println("Erro: " + e.getMessage());
        //     e.printStackTrace();
        // }
        return null;
        
    }

    public void sendReply(byte[] reply, InetAddress clientHost, int clientPort) throws IOException, NotBoundException { 
        // Enviar a resposta para o cliente via RMI
    }
}
