package Enum;

public enum Curso {
    Sem_Curso(0,"Não está cursando nenhum curso"),
    BTI_Livre(1,"Graduação BTI Ênfase Livre"),
    BTI_CC(2,"Graduação BTI Ênfase Ciência da Computação"),
    BTI_DS(3,"Graduação BTI Ênfase Desenvolvimento de Software"),
    PosGraduacao(4,"Pós-Graduação");

    private int cod;
    private String nome;

    Curso(int cod,String nome) {
        this.nome = nome;
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public int getCod() {
        return cod;
    }
}
