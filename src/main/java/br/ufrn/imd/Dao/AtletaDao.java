package br.ufrn.imd.Dao;

//import br.ufrn.imd.Dao;
import br.ufrn.imd.Modelos.Atleta;

import java.util.ArrayList;
import java.util.Optional;

public class AtletaDao implements Dao<Atleta> {
    private ArrayList<Atleta> lista;

    public AtletaDao() {
        lista = new ArrayList<>();
    }

    public AtletaDao( ArrayList<Atleta> lista){
        this.lista = lista;
    }

    public ArrayList<Atleta> getAll() {
        return this.lista;
    }

    public void save(Atleta atleta) {
        this.lista.add(atleta);
    }

    public void update(Atleta t){
        for(Atleta atleta: this.lista){
            if(atleta.getMatricula() == t.getMatricula()){
                atleta = t;
            }
        }
    }

    public void delete(Atleta atleta){
        this.lista.remove(atleta);
    }

    public Atleta get(long mat) {
        for(Atleta atleta : this.lista) {
            if(atleta.getMatricula() == mat) {
                return atleta;
            }
        }
        return null;
    }


}