import java.rmi.Naming;
import java.rmi.RemoteException;

public class ClienteRMI {

    public static int doOperation(ICalculadora calculadora, int methodId, int args1, int args2) throws RemoteException {
        int result = 0;
        try {
            switch (methodId) {
                case 1:
                    result = calculadora.somar(args1, args2);
                    break;
                case 2:
                    result = calculadora.subtrair(args1, args2);
                    break;
                case 3:
                    result = calculadora.multiplicar(args1, args2);
                    break;
                case 4:
                    result = (int) calculadora.dividir(args1, args2);
                    break;
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        String url = "rmi://localhost/Calculadora";
        ICalculadora calculadora = (ICalculadora) Naming.lookup(url);
        int methodId = 0;
        while (methodId != 5) {
            System.out.println("--- Cliente ---");
            System.out.println("Calculadora");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            System.out.println("Digite o número do método desejado: ");
            methodId = Integer.parseInt(System.console().readLine());
            System.out.println("Digite o primeiro número: ");
            int num1 = Integer.parseInt(System.console().readLine());
            System.out.println("Digite o segundo número: ");
            int num2 = Integer.parseInt(System.console().readLine());
            int result = doOperation(calculadora, methodId, num1, num2);
            System.out.println("Resultado: " + result);

        }

        doOperation(calculadora, 1, 10, 5);
    }

}
