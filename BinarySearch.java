import java.util.Arrays;

public class BinarySearch{
    public static int rank(int key, int[] list){
        int low = 0;
        int high = list.length - 1;
        int mid = 0;
        while(low <= high){
            mid = low + (high-low)/2;
            if(key < list[mid]){
                high = mid - 1;
            }
            else if( key > list[mid]){
                low = mid + 1;
            }
            else return mid;
        }
        return -1;
    
    }

    public static void main(String[] args){
        In in = new In(args[0]);
        
        int [] listOfItem = in.readAllInts();
        Arrays.sort(listOfItem);
        int key;
        while(StdIn.isEmpty() == false){
            key = StdIn.readInt();
            if(rank(key,listOfItem) == -1)
            {
                System.out.println(key);
            }
        }
    }
}