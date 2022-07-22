package br.ufrn.imd.Dao;

import java.util.List;
import java.util.Optional;

/**
 * The interface Dao.
 *
 * @param <T> the type parameter
 */
public interface Dao<T> {

    /**
     * Get t.
     *
     * @param id the id
     * @return the t
     */
    T get(long id);

    /**
     * Gets all.
     *
     * @return the all
     */
    List<T> getAll();

    /**
     * Save.
     *
     * @param t the t
     */
    void save(T t);

    /**
     * Update.
     *
     * @param t the t
     */
    void update(T t);

    /**
     * Delete.
     *
     * @param id the id
     */
    void delete(long id);

}