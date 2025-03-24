/*
@ASSESSME.USERID: hh3283 
@ASSESSME.AUTHOR: 
@ASSESSME.DESCRIPTION: 
@ASSESSME.ANALYZE: YES
*/


public interface Graph<E> {
    public void add(E value);
    public boolean contains(E value);
    public int size();
    public void connectDirected(E a,E b);
    public void connectUndirected(E a,E b);
    public boolean connected(E a,E b);
} 
