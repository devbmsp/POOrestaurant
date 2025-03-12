import java.util.Scanner;

public class Pedido {
    private final Scanner _scanner;
    float total = 0;
    int quantCalabresa = 0;
    int quantQueijo = 0;
    int quantAmores = 0;

    public Pedido(Scanner scanner) {
        _scanner = scanner;
    }

    public float fazerPedido(String name) {
        boolean finalizado = false;
        while (!finalizado) {
            System.out.println("Olá " + name +
                    "\nCardápio\n" +
                    "1 - Calabresa - 10 Reais\n" +
                    "2 - Queijo - 5 Reais\n" +
                    "3 - 2 Amores - 15 Reais\n" +
                    "Para finalizar, digite 0\n"
            );
            String result = _scanner.nextLine();
            switch (result) {
                case "1":
                    total += 10;
                    quantCalabresa++;
                    break;
                case "2":
                    total += 5;
                    quantQueijo++;
                    break;
                case "3":
                    total += 15;
                    quantAmores++;
                    break;
                case "0":
                    System.out.println("Seu Pedido:");
                    if (quantCalabresa > 0) {
                        System.out.println(quantCalabresa + " - Calabresa");
                    }
                    if (quantQueijo > 0) {
                        System.out.println(quantQueijo + " - Queijo");
                    }
                    if (quantAmores > 0) {
                        System.out.println(quantAmores + " - 2 Amores");
                    }
                    finalizado = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        return total;
    }
}
