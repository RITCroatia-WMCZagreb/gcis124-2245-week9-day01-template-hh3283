public class Graphs {
    static Graph<String> makeGraph(){
        Graph<String> graph = new AdjacencyGraph<>();
        Vertex<String> va = new Vertex<String>("A");
        Vertex<String> vb = new Vertex<String>("B");
        Vertex<String> vc = new Vertex<String>("C");
        Vertex<String> vd = new Vertex<String>("C");
        Vertex<String> ve = new Vertex<String>("E");
        Vertex<String> vf = new Vertex<String>("F");
        Vertex<String> vg = new Vertex<String>("G");
        Vertex<String> vh = new Vertex<String>("H");
        Vertex<String> vi = new Vertex<String>("I");
        Vertex<String> vj = new Vertex<String>("J");
        Vertex<String> vk = new Vertex<String>("K");

        graph.add("A");
        graph.add("B");
        graph.add("C");
        graph.add("D");
        graph.add("E");
        graph.add("F");
        graph.add("G");
        graph.add("H");
        graph.add("I");
        graph.add("J");
        graph.add("K");


        graph.connectUndirected("A", null);





        va.connect(vb);
        va.connect(vc);

        vb.connect(va);
        vb.connect(ve);

        vc.connect(vh);
        vc.connect(vd);
        vc.connect(ve);

        vd.connect(vb);
        vd.connect(vc);
        vd.connect(vf);

        ve.connect(vb);
        ve.connect(vd);
        ve.connect(vf);

        vf.connect(vd);
        vf.connect(vg);

        vi.connect(vk);
        vi.connect(vj);

        vk.connect(vi);
        vk.connect(vj);

        vj.connect(vi);
        vj.connect(vk);






        return graph;
    }
}
