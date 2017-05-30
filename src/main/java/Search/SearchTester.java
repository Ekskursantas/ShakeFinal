package Search;

public class SearchTester {

    public static void main(String[] args) {
        
        try {
            String[] array = FileUtility.toStringArray("LOCATION HERE", "[^A-Za-z]");

            Stopwatch lTimer = new Stopwatch();
            Linked(array);
            System.out.println(lTimer.elapsedTime());
            
            Stopwatch aTimer = new Stopwatch();
            Arrayed(array);
            System.out.println(aTimer.elapsedTime());
            
            Stopwatch bTimer = new Stopwatch();
            Balanced(array);
            System.out.println(bTimer.elapsedTime());
            
            Stopwatch hTimer = new Stopwatch();
            Hashed(array);
            System.out.println(hTimer.elapsedTime());
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }
    
    public static void Linked(String[] array) {
        
        LinkedST<String, Integer> algorithm = new LinkedST<>();
        for (String word : array) {
            if (!algorithm.contains(word)) {
                algorithm.put(word, 1);
            } else {
                algorithm.put(word, algorithm.get(word) + 1);
            }
        }
        

    }
    
    public static void Hashed(String[] array) {
        
        HashST<String, Integer> algorithm = new HashST<>();
        for (String word : array) {
            if (!algorithm.contains(word)) {
                algorithm.put(word, 1);
            } else {
                algorithm.put(word, algorithm.get(word) + 1);
            }
        }
        

    }
    
    public static void Arrayed(String[] array){
        ArrayST<String, Integer> algorithm = new ArrayST<>();
        for (String word : array) {
            if (!algorithm.contains(word)) {
                algorithm.put(word, 1);
            } else {
                algorithm.put(word, algorithm.get(word) + 1);
            }
        }
        

    }
    


    private static void Balanced(String[] array) {
         BalancedTreeST<String, Integer> algorithm = new BalancedTreeST<>();
        for (String word : array) {
            if (!algorithm.contains(word)) {
                algorithm.put(word, 1);
            } else {
                algorithm.put(word, algorithm.get(word) + 1);
            }
        }

    }
}
