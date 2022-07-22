package br.ufrn.imd.Enum;

/**
 * The enum Tipo.
 */
public enum Tipo {
    /**
     * Individual tipo.
     */
    Individual(1,"Individual"),
    /**
     * Coletiva tipo.
     */
    Coletiva(2,"Coletiva");

    private int cod;
    private String tipo;

    Tipo(int cod, String tipo) {
        this.cod = cod;
        this.tipo = tipo;
    }

    /**
     * Gets cod.
     *
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * Gets tipo.
     *
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }
}
