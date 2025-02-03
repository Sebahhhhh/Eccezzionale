import java.util.Scanner;

public class TestPositivo {
    public static void main(String[] args) {
        // scanner
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci Un Numero: ");
        int numero = in.nextInt();

        try {
            NumeroPositivo numeroPositivo = new NumeroPositivo(numero);
            System.out.println("Numero: " + numeroPositivo.getNumero());
        } catch (NegativoExcepion | IntervalloException e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }
}