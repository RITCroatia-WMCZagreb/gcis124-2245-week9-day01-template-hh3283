/*
@ASSESSME.USERID: hh3283 
@ASSESSME.AUTHOR: 
@ASSESSME.DESCRIPTION: 
@ASSESSME.ANALYZE: YES
*/

import java.util.HashMap;
import java.util.Map;

public class AdjacencyGraph<E> implements Graph<E> {

    private Map<E,Vertex<E>> vertices;

    public AdjacencyGraph(){
        this.vertices = new HashMap<>();
    }

    @Override
    public void add(E value) {
        Vertex<E> vertex = new Vertex<E>(value);
        this.vertices.put(value, vertex);
    }

    @Override
    public boolean contains(E value) {
        return this.vertices.containsKey(value);
    }

    @Override
    public int size() {
        return this.vertices.size();
    }

    @Override
    public void connectDirected(E a, E b) {
        Vertex<E> va = this.vertices.get(a);
        Vertex<E> vb = this.vertices.get(b);
        va.connect(vb);
    }

    @Override
    public void connectUndirected(E a, E b) {
        Vertex<E> va = this.vertices.get(a);
        Vertex<E> vb = this.vertices.get(b);
        va.connect(vb);
        vb.connect(va);
    }

    @Override
    public boolean connected(E a, E b) {
        Vertex<E> va = this.vertices.get(a);
        Vertex<E> vb = this.vertices.get(b);
        return va.connected(vb);
    }
    
}
