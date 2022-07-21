public class AtletaDao implements Dao<Atleta> {
    private ArrayList<Atleta> lista;

    public AtletaDao() {
        lista = new ArrayList<>();
    }

    public ArrayList<Atleta> getAll() {
        return this.lista;
    }

    public void save(Atleta atleta) {
        this.atleta.add(atleta);
    }

    public void get(long mat) {
        for(Atleta atleta : this.lista) {
            if((atleta.getMatricula().equals(mat))) {
                return atleta
            }
        }
        return null;
    }
}