import java.util.*;

public class UF{
    static int id[];
    static int sz[];
    
    UF(int N){
        id = new int[N];
        sz = new int[N];
        for(int i = 0;i < N;i++){
            id[i] = i;
            sz[i] = 1;
        }
    }
    private static int root(int key){
        while(key != id[key]) {
            key = id[key];
            id[key] = id[id[key]]
        }
        return key;
    }
    
    private static boolean isConnected(int p,int q){
        return (root(p) == root(q));
    }
    
    private static void getUnion(int p, int q){
        
        int rootp = root(p);
        int rootq = root(q);
        if(rootp == rootq) return;
        if(sz[rootp]<=sz[rootq]){
            id[rootq] = id[rootp];
            sz[rootq] +=sz[rootp];
        }
        else{
            id[rootp] = id[rootq];
            sz[rootp] += id[rootq];
        }
        
    }
    
    public static void main(String[] args){
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while(StdIn.isEmpty()==false){
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(uf.isConnected(p,q) == false){
                uf.getUnion(p,q);
                StdOut.println(p + " is connected to "+ q);
            }
        }
    }
}