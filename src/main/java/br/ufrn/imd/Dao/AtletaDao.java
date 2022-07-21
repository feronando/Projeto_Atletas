package br.ufrn.imd.Dao;

import br.ufrn.imd.Atleta;

import java.util.ArrayList;
import java.util.Optional;

public class AtletaDao implements Dao<Atleta> {
    private ArrayList<Atleta> lista;

    public AtletaDao() {
        lista = new ArrayList<>();
    }

    public ArrayList<Atleta> getAll() {
        return this.lista;
    }

    public void save(Atleta atleta) {
        this.lista.add(atleta);
    }

    public void update(Atleta t, String[] params){
        //TODO
    }

    public void delete(Atleta t){
        //TODO
    }

    public Optional<Atleta> get(long mat) {
        for(Atleta atleta : this.lista) {
            if((atleta.getMatricula() == mat)) {
                return atleta;
            }
        }
        return null;
    }


}