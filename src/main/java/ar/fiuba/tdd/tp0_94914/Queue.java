package ar.fiuba.tdd.tp0_94914;

/**
 * Created by Nicolas on 27/08/2016.
 */
public interface Queue<T> {
    boolean isEmpty();
    int size();
    void add(T item); //agrega un item
    T top(); // retornar el primer item, lanzar exception si esta vacio.
    void remove(); // remover el primer item, lanzar exception si esta vacio.
}