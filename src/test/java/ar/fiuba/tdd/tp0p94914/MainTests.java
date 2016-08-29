package ar.fiuba.tdd.tp0p94914;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTests {

    @Test
    public void isEmpty() {
        Cola<Integer> cola = new Cola<Integer>();
        assertTrue(cola.isEmpty());

        cola.add(4);
        assertFalse(cola.isEmpty());

        cola.remove();
        assertTrue(cola.isEmpty());
    }

    @Test
    public void size() {
        Cola<Integer> cola = new Cola<Integer>();
        assertEquals(cola.size(),0);

        cola.add(1);
        assertEquals(cola.size(),1);

        cola.add(2); cola.add(3); cola.add(4);
        assertEquals(cola.size(),4);

        cola.remove();
        assertEquals(cola.size(),3);
    }

    @Test
    public void add() {
        Cola<Integer> cola = new Cola<Integer>();
        cola.add(1);
        cola.add(2);
        cola.add(3);
        cola.add(4);
        cola.add(5);
        cola.add(6);
        cola.add(7);
        cola.add(8);
        assertEquals(cola.size(),8);
    }

    @Test
    public void top() {
        Cola<Integer> cola = new Cola<Integer>();
        cola.add(1);
        assertSame(cola.top(),1);

        cola.add(10);
        assertSame(cola.top(),1);

        cola.remove();
        assertSame(cola.top(),10);
    }

    @Test
    public void remove() {
        Cola<Integer> cola = new Cola<Integer>();
        cola.add(1);
        cola.add(2);
        cola.add(3);
        assertEquals(cola.size(),3);

        cola.remove();
        assertEquals(cola.size(),2);

        cola.remove();
        assertEquals(cola.size(),1);

        cola.remove();
        assertEquals(cola.size(),0);
    }
}
