package Search.sort;

public class MergeSortBU {

    
    private static String[] aux;
    
    public static void merge(String[] data, int lo, int mid, int hi) {

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) 
        {
            aux[k] = data[k];
        }
        for (int k = lo; k <= hi; k++) 
        {
            if (i > mid) {
                data[k] = aux[j++];
            } else if (j > hi) {
                data[k] = aux[i++];
            } else if ((aux[j].compareTo(aux[i])) < 0) {
                data[k] = aux[j++];
            } else {
                data[k] = aux[i++];
            }
        }
    }
  
 
 
public static String[] sort(String[] data)   { 
    int N = data.length;   
    aux = new String[N];   
    for (int sz = 1; sz < N; sz = sz+sz)       
        for (int lo = 0; lo < N-sz; lo += sz+sz)
            merge((String[]) data, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));  
    return data;
}



}
