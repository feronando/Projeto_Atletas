package br.ufrn.imd.Controlador;

/**
 * The interface Controller.
 *
 * @param <T> the type parameter
 */
public interface Controller<T> {

    /**
     * Index.
     */
    public void index();

    /**
     * Create.
     *
     * @param t the t
     */
    public void create(T t);

    /**
     * Show.
     *
     * @param id the id
     */
    public void show(long id);

    /**
     * Edit.
     *
     * @param t the t
     */
    public void edit(T t);

    /**
     * Delete.
     *
     * @param id the id
     */
    public void delete(long id);

}