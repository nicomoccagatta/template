package ar.fiuba.tdd.tp0p94914;

/**
 * Created by Nicolas on 28/08/2016.
 */
public abstract class Node<T> {

    public abstract boolean isEmpty();

    public abstract int sizeQueueToTheLast();

    public abstract Node<T> add(T item);

    public abstract T getObject();

    public abstract Node<T> getNextObject();

}
