package br.ufrn.imd.Dao;

import br.ufrn.imd.Modelos.Atleta;
import java.util.ArrayList;

/**
 * The type Atleta dao.
 */
public class AtletaDao implements Dao<Atleta> {
    private ArrayList<Atleta> lista;

    /**
     * Instantiates a new Atleta dao.
     *
     * @param lista the lista
     */
    public AtletaDao( ArrayList<Atleta> lista ){
        this.lista = lista;
    }

    public ArrayList<Atleta> getAll() {
        return this.lista;
    }

    public void save(Atleta atleta) {
        this.lista.add(atleta);
    }

    public void update(Atleta atl){
        for(int i = 0; i<lista.size(); i++){
            if(lista.get(i).getMatricula() == atl.getMatricula()){
                lista.set(i, atl);
                return;
            }
        }
    }

    public void delete(long id){
        this.lista.remove(get(id));
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