package br.ufrn.imd;

import Enum.*;
import java.util.ArrayList;

public class Atleta {
    private long matricula;
    private String nome;
    private Sexo sexo;
    private Categoria categoria;
    private Curso curso;
    private int ano_periodo;
    private ArrayList<Modalidade> moda;

    public Atleta() {
        moda = new ArrayList<Modalidade>();
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

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
        }
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        switch (categoria) {
            case 1:
                this.categoria = Categoria.Aluno;
                break;
            case 2:
                this.categoria = Categoria.Servidor;
                break;
        }
    }

    public Curso getCurso() {
        return curso;
    }

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
        }
    }

    public int getAno_periodo() {
        return ano_periodo;
    }

    public void setAno_periodo(int ano_periodo) {
        this.ano_periodo = ano_periodo;
    }

    public ArrayList<Modalidade> getMod() {
        return moda;
    }

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
}
