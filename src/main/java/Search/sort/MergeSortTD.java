
package Search.sort;


public class MergeSortTD {

    private static String[] aux;


    public static String[] sort(String[] data) {
        aux = new String[data.length];     
        sort(data, 0, data.length - 1);
        return data;
    }

    private static void sort(String[] data, int lo, int hi) {  
     
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(data, lo, mid); // Sort left half.    
        sort(data, mid + 1, hi); // Sort right half.   
        merge(data, lo, mid, hi);
    }
    
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

}
