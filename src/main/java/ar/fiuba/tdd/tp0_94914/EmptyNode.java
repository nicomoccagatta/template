package ar.fiuba.tdd.tp0_94914;

/**
 * Created by Nicolas on 28/08/2016.
 */
public class EmptyNode<T> extends Node<T> {

    public final boolean isEmpty(){
        return true;
    }

    public final int sizeQueueToTheLast() {
        return 0;
    }

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
