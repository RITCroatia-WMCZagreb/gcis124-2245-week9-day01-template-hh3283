/*
@ASSESSME.USERID: hh3283 
@ASSESSME.AUTHOR: 
@ASSESSME.DESCRIPTION: 
@ASSESSME.ANALYZE: YES
*/

import java.util.*;

public class Vertex<E> {
    private E value;
    private Set<Vertex<E>> neighbors;

    public Vertex(E value){
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    public E getValue() {
        return this.value;
    }

    public Set<Vertex<E>> getNeighbors() {
        return neighbors;
    }

    public void connect(Vertex<E> neighbour){
        this.neighbors.add(neighbour);
    }

    public boolean connected(Vertex<E> neighbor){
        return this.neighbors.contains(neighbor);
    }

    public static void main(String[] args) {
        Vertex<String> va = new Vertex<String>("A");
        Vertex<String> vb = new Vertex<String>("B");
        Vertex<String> vc = new Vertex<String>("C");

        va.connect(vb);
        va.connect(vc);

        vb.connect(vc);

        vc.connect(va);
        vc.connect(va);


    }
}
