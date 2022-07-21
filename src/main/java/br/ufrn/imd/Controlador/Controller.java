package br.ufrn.imd.Controlador;
public interface Controller<T> {

    public void index(); 

    public void create(T t);

    public void show(long id);

    public void edit(T t);

    public void delete(long id);

}