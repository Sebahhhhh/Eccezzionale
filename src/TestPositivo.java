import java.util.Scanner;

public class TestPositivo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("");
        System.out.println("Inserisci un numero che deve essere: ");
        System.out.println("fra 0 e 30");
        System.out.println("non negativo");
        System.out.println("non 20");
        System.out.println("  ");
        int numero = in.nextInt();

        try {
            NumeroPositivo numeroPositivo = new NumeroPositivo(numero);
            System.out.println("Numero: " + numeroPositivo.getNumero());


        } catch (NegativoExcepion | IntervalloException | EscludiVentiException e) {
            System.err.println("Errore: " + e.getMessage());

        } catch (Gerarchia e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }
    }
