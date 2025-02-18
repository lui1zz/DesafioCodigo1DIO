import java.util.Scanner;

public class SaqueDeposito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        System.out.printf("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();
        double saldoFinal;
        int contador = 0;
        
        // TODO: Na linha abaixo, implemente a entrada das três transações:
        saldoFinal = saldoInicial;
        do{
        System.out.printf("Digite D para deposito e S para saques.");
        String transacao = scanner.next();
        switch (transacao) {  
          case "D":
          case "d":
          System.out.println("Digite o valor do depósito:");
              double valorTrans = scanner.nextDouble();
              saldoFinal = saldoFinal + valorTrans;
        break;
        
        case "S":
        case "s":
        System.out.println("Digite o valor do saque:");
              double valorTransSaque = scanner.nextDouble();
              saldoFinal = saldoFinal - valorTransSaque;
        break;

        default:
        System.out.println("Opção inválida.");
        break;
    }
        contador++;
        }
        while(contador<3);
        // TODO: Na linha abaixo, realize o cálculo do saldo final:
        
        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}