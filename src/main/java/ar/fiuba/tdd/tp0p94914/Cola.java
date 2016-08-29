package ar.fiuba.tdd.tp0p94914;

/**
 * Created by Nicolas on 27/08/2016.
 */
public class Cola<T> implements Queue<T> {
    public Cola() {
        primerNodo = new EmptyNode<T>();
    }

    public final boolean isEmpty() {
        return primerNodo.isEmpty();
    }

    public final int size() {
        return primerNodo.sizeQueueToTheLast();
    }

    public final void add(T item) {
        primerNodo = primerNodo.add(item);
    }

    public final T top() {
        return primerNodo.getObject();
    }

    public final void remove() {
        primerNodo = primerNodo.getNextObject();
    }

    private Node<T> primerNodo;
}
