package br.ufrn.imd.Controlador;
public interface Controller<T> {

    public void index(); 

    public void create(T t);

    public void show(long id, T t);

    public void edit(long id, T t);

    public void delete(long id, T t);

}