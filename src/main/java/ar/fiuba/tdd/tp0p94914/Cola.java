package ar.fiuba.tdd.tp0p94914;

/**
 * Created by Nicolas on 27/08/2016.
 */
public class Cola<T> implements Queue<T> {
    public Cola() {
        firstNode = new EmptyNode<T>();
    }

    public final boolean isEmpty() {
        return firstNode.isEmpty();
    }

    public final int size() {
        return firstNode.sizeQueueToTheLast();
    }

    public final void add(T item) {
        firstNode = firstNode.add(item);
    }

    public final T top() {
        return firstNode.getObject();
    }

    public final void remove() {
        firstNode = firstNode.getNextObject();
    }

    private Node<T> firstNode;
}
