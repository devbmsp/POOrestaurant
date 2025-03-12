import java.util.Scanner;

public class Relatorio {
    private final Scanner _scanner;
    public Relatorio(Scanner Scanner) {
        _scanner = Scanner;
    }
    public void calculo(float total) {

        var taxas = 10*total/100;
        var valorTotal = total + taxas;
        System.out.println("Total : " + valorTotal +"\nTaxas (10%) :"+ taxas );
        System.out.println("Insira o valor Pago : ");

        var recebido = _scanner.nextFloat();


        if (recebido > valorTotal)
        {
            var devolver = recebido - valorTotal;
            System.out.println("opa! pelo visto enviou um valor a mais, segue o seu troco "+devolver );
        }
        else if (recebido < valorTotal)
        {
            System.out.println("Valor inferior ao solicitado, Faça o Pedido novamente");
        }
        else
        {
            System.out.println("Obrigado pela Compra!");
        }

    }
}
