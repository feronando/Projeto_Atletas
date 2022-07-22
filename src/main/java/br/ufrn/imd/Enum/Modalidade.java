package br.ufrn.imd.Enum;

/**
 * The enum Modalidade.
 */
public enum Modalidade {
    /**
     * Atl modalidade.
     */
    Atl(1,"Atletismo",Tipo.Individual),
    /**
     * Bas modalidade.
     */
    Bas(2,"Basquete", Tipo.Coletiva),
    /**
     * The Fut c.
     */
    FutC(3,"Futebol de Campo",Tipo.Coletiva),
    /**
     * Futs modalidade.
     */
    Futs(4,"Futsal",Tipo.Coletiva),
    /**
     * Han modalidade.
     */
    Han(5,"Handebol",Tipo.Coletiva),
    /**
     * Jiu j modalidade.
     */
    JiuJ(6,"Jiu-Jitsu",Tipo.Individual),
    /**
     * Nat modalidade.
     */
    Nat(7,"Natação",Tipo.Individual),
    /**
     * The Ten m.
     */
    TenM(8,"Tênis de Mesa",Tipo.Individual),
    /**
     * Vol modalidade.
     */
    Vol(9,"Voleibol",Tipo.Coletiva);

    private final int cod;
    private final String nome;
    private final Tipo tipo;

    Modalidade(int cod, String nome, Tipo tipo) {
        this.cod = cod;
        this.nome = nome;
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
     * Gets nome.
     *
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Gets tipo.
     *
     * @return the tipo
     */
    public Tipo getTipo() {
        return tipo;
    }
}
