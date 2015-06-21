import java.util.*;

public class UF{
    static int id[];
    
    UF(int N){
        id = new int[N];
        for(int i = 0;i < N;i++){
            id[i] = i;
        }
    }
    
    private static boolean isConnected(int p,int q){
        return (id[p] == id[q]) ? true : false;
    }
    
    private static void getUnion(int p, int q){
        
        id[p] = id[q];
        //int needToChange[]=find(id[p]);
        for(int i = 0;i< id.length; i++){
            if(id[i] == id[p])
                id[i] = id[q];
        }
    }
    
    public static void main(String[] args){
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while(StdIn.isEmpty()==false){
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            StdOut.println(p + " " + q);
            if(uf.isConnected(p,q) == false){
                uf.getUnion(p,q);
                StdOut.println(p + " is connected to "+ q);
            }
        }
    }
}