public class NumeroPositivo {
    private int numero;
    // controlli
    public NumeroPositivo(int numero) throws NegativoExcepion, IntervalloException {
        if (numero < 0) {
            throw new NegativoExcepion("E' negativo.");
        }
        if (numero > 30) {
            throw new IntervalloException("Il numero non è nell'intervallo fra 0 e 30.");
        }
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}