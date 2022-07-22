package br.ufrn.imd.Enum;

/**
 * The enum Curso.
 */
public enum Curso {
    /**
     * The Sem curso.
     */
    Sem_Curso(0,"Não está cursando nenhum curso"),
    /**
     * The Bti livre.
     */
    BTI_Livre(1,"Graduação BTI Ênfase Livre"),
    /**
     * The Bti cc.
     */
    BTI_CC(2,"Graduação BTI Ênfase Ciência da Computação"),
    /**
     * The Bti ds.
     */
    BTI_DS(3,"Graduação BTI Ênfase Desenvolvimento de Software"),
    /**
     * Pos graduacao curso.
     */
    PosGraduacao(4,"Pós-Graduação");

    private int cod;
    private String nome;

    Curso(int cod,String nome) {
        this.nome = nome;
        this.cod = cod;
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
     * Gets cod.
     *
     * @return the cod
     */
    public int getCod() {
        return cod;
    }
}
