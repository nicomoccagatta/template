package ar.fiuba.tdd.tp0p94914;

/**
 * Created by Nicolas on 28/08/2016.
 */
public class EmptyNode<T> extends Node<T> {

    public final boolean isEmpty() {
        return true;
    }

    public final int sizeQueueToTheLast() {
        return 0;
    }

    // Como es un nodo vacio, se retorna un nodo lleno con el dato item
    public final Node<T> add(T item) {
        return new DataNode<T>(item);
    }

    public final T getObject() {
        throw new AssertionError();
    }

    public final Node<T> getNextObject() {
        throw new AssertionError();
    }
}
