package ar.fiuba.tdd.tp0p94914;

/**
 * Created by Nicolas on 28/08/2016.
 */
public class DataNode<T> extends Node<T> {
    public DataNode(T item) {
        this.data = item;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int sizeQueueToTheLast() {
        return 1 + nextNode.sizeQueueToTheLast();
    }

    // Como es un nodo lleno, el dato se agrega en el nodo siguiente
    public final Node<T> add(T item) {
        nextNode = nextNode.add(item);
        return this;
    }

    public final T getObject() {
        return data;
    }

    public final Node<T> getNextObject() {
        return nextNode;
    }

    private T data;
    private Node<T> nextNode = new EmptyNode<T>();
}
