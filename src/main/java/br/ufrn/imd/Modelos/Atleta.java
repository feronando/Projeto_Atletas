package br.ufrn.imd.Modelos;

import br.ufrn.imd.Enum.*;
import java.util.ArrayList;

/**
 * The type Atleta.
 */
public class Atleta {
    private long matricula;
    private String nome;
    private Sexo sexo;
    private Categoria categoria;
    private Curso curso;
    private int ano_periodo;
    private ArrayList<Modalidade> moda;

    /**
     * Instantiates a new Atleta.
     */
    public Atleta() {
        moda = new ArrayList<Modalidade>();
    }

    /**
     * Gets matricula.
     *
     * @return the matricula
     */
    public long getMatricula() {
        return matricula;
    }

    /**
     * Sets matricula.
     *
     * @param matricula the matricula
     */
    public void setMatricula(long matricula) {
        this.matricula = matricula;
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
     * Sets nome.
     *
     * @param nome the nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Gets sexo.
     *
     * @return the sexo
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * Sets sexo.
     *
     * @param sexo the sexo
     */
    public void setSexo(int sexo) {
        switch (sexo) {
            case 1:
                this.sexo = Sexo.Feminino;
                break;
            case 2:
                this.sexo = Sexo.Masculino;
                break;
            case 3:
                this.sexo = Sexo.NaoBinario;
                break;
            default:
                break;
        }
    }

    /**
     * Gets categoria.
     *
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Sets categoria.
     *
     * @param categoria the categoria
     */
    public void setCategoria(int categoria) {
        switch (categoria) {
            case 1:
                this.categoria = Categoria.Aluno;
                break;
            case 2:
                this.categoria = Categoria.Servidor;
                break;
            default:
                break;
        }
    }

    /**
     * Gets curso.
     *
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * Sets curso.
     *
     * @param curso the curso
     */
    public void setCurso(int curso) {
        switch (curso) {
            case 0:
                this.curso = Curso.Sem_Curso;
                break;
            case 1:
                this.curso = Curso.BTI_Livre;
                break;
            case 2:
                this.curso = Curso.BTI_CC;
                break;
            case 3:
                this.curso = Curso.BTI_DS;
                break;
            case 4:
                this.curso = Curso.PosGraduacao;
                break;
            default:
                break;
        }
    }

    /**
     * Gets ano periodo.
     *
     * @return the ano periodo
     */
    public int getAno_periodo() {
        return ano_periodo;
    }

    /**
     * Sets ano periodo.
     *
     * @param ano_periodo the ano periodo
     */
    public void setAno_periodo(int ano_periodo) {
        this.ano_periodo = ano_periodo;
    }

    /**
     * Gets mod.
     *
     * @return the mod
     */
    public ArrayList<Modalidade> getMod() {
        return moda;
    }

    /**
     * Sets mod.
     *
     * @param moda the moda
     */
    public void setMod(String moda) {
        if (moda.equals(Modalidade.Atl.getNome()))
            this.moda.add(Modalidade.Atl);
        else if (moda.equals(Modalidade.Bas.getNome()))
            this.moda.add(Modalidade.Bas);
        else if (moda.equals(Modalidade.FutC.getNome()))
            this.moda.add(Modalidade.FutC);
        else if (moda.equals(Modalidade.Futs.getNome()))
            this.moda.add(Modalidade.Futs);
        else if (moda.equals(Modalidade.Han.getNome()))
            this.moda.add(Modalidade.Han);
        else if (moda.equals(Modalidade.JiuJ.getNome()))
            this.moda.add(Modalidade.JiuJ);
        else if (moda.equals(Modalidade.Nat.getNome()))
            this.moda.add(Modalidade.Nat);
        else if (moda.equals(Modalidade.TenM.getNome()))
            this.moda.add(Modalidade.TenM);
        else
            this.moda.add(Modalidade.Vol);
    }

    /**
     * Sets mod.
     *
     * @param moda the moda
     */
    public void setMod(int moda) {
        if (moda == Modalidade.Atl.getCod())
            this.moda.add(Modalidade.Atl);
        else if (moda == Modalidade.Bas.getCod())
            this.moda.add(Modalidade.Bas);
        else if (moda == Modalidade.FutC.getCod())
            this.moda.add(Modalidade.FutC);
        else if (moda == Modalidade.Futs.getCod())
            this.moda.add(Modalidade.Futs);
        else if (moda == Modalidade.Han.getCod())
            this.moda.add(Modalidade.Han);
        else if (moda == Modalidade.JiuJ.getCod())
            this.moda.add(Modalidade.JiuJ);
        else if (moda == Modalidade.Nat.getCod())
            this.moda.add(Modalidade.Nat);
        else if (moda == Modalidade.TenM.getCod())
            this.moda.add(Modalidade.TenM);
        else
            this.moda.add(Modalidade.Vol);
    }
}
