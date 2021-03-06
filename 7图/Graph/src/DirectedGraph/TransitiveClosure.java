package DirectedGraph;

/**
 * 传递闭包
 * 顶点对的可达性
 */
public class TransitiveClosure {
    private DirectedDFS[] all;
    TransitiveClosure(Digraph G){
        all = new DirectedDFS[G.V()];
        for(int v=0; v<G.V(); v++){
            all[v] = new DirectedDFS(G,v);
        }
    }

    boolean reachable(int v,int w){
        return all[v].marked(w);
    }
}
