package br.ufrn.imd.Enum;

/**
 * The enum Sexo.
 */
public enum Sexo {
    /**
     * Feminino sexo.
     */
    Feminino(1, "Feminino"),
    /**
     * Masculino sexo.
     */
    Masculino(2, "Masculino"),
    /**
     * Nao binario sexo.
     */
    NaoBinario(3, "Não-binário");

    private int cod;
    private String genero;

    Sexo(int cod, String genero) {
        this.cod = cod;
        this.genero = genero;
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
     * Gets genero.
     *
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }
}