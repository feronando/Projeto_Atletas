package Enum;

public enum Sexo {
    Feminino(1, "Feminino"),
    Masculino(2, "Masculino"),
    NaoBinario(3, "Não-binário");

    private int cod;
    private String genero;

    Sexo(int cod, String genero) {
        this.cod = cod;
        this.genero = genero;
    }

    public int getCod() {
        return cod;
    }

    public String getGenero() {
        return genero;
    }
}