import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);

        boolean sair = true;
        while (sair) {
            System.out.printf("Escolha uma das opções: 1-Fazer pedido / 2-Sair\n");
            String answer = readLine.nextLine();
            switch(answer) {
                case "2": sair = false; break;
                case "1":
                    System.out.println("Qual o Seu nome?");
                    String name = readLine.nextLine();

                    Pedido pedido = new Pedido(readLine);
                    var total =  pedido.fazerPedido(name);

                    Relatorio relatorio = new Relatorio(readLine);
                    relatorio.calculo(total);

            }
        }



    }
}