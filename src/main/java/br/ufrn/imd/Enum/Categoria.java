package br.ufrn.imd.Enum;

/**
 * The enum Categoria.
 */
public enum Categoria {
    /**
     * Aluno categoria.
     */
    Aluno(1, "Aluno"),
    /**
     * Servidor categoria.
     */
    Servidor(2, "Servidor");

    private int categoria;
    private String cat;

    Categoria(int categoria, String cat) {
        this.categoria = categoria;
        this.cat = cat;
    }

    /**
     * Gets categoria.
     *
     * @return the categoria
     */
    public int getCategoria() {
        return categoria;
    }

    /**
     * Gets cat.
     *
     * @return the cat
     */
    public String getCat() {
        return cat;
    }
}
