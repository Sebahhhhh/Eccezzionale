public class NumeroPositivo {
    private int numero;

    public NumeroPositivo(int numero) throws NegativoExcepion, IntervalloException, EscludiVentiException {
        if (numero < 0) {
            throw new NegativoExcepion("Il numero non può essere negativo.");
        }
        if (numero > 30) {
            throw new IntervalloException("Il numero deve essere tra 0 e 30.");
        }
        if (numero == 20) {
            throw new EscludiVentiException("Il numero non può essere 20.");
        }
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}