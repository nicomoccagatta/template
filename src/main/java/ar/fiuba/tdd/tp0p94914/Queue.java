package ar.fiuba.tdd.tp0p94914;

/**
 * Created by Nicolas on 27/08/2016.
 */
public interface Queue<T> {
    boolean isEmpty();

    int size();

    void add(T item);

    T top();

    void remove();

}