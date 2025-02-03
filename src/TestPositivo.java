import java.util.Scanner;

public class TestPositivo {
    public static void main(String[] args) {
        // scanner
        Scanner in = new Scanner(System.in);

        System.out.print("");
        System.out.println("Inserisci un numero che deve essere: ");
        System.out.println("fra 0 e 30");
        System.out.println("non negativo");
        System.out.println("Numero: ");
        int numero = in.nextInt();

        try {
            NumeroPositivo numeroPositivo = new NumeroPositivo(numero);
            System.out.println("Numero: " + numeroPositivo.getNumero());
        } catch (NegativoExcepion | IntervalloException e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }
}