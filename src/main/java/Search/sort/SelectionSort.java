package Search.sort;

public class SelectionSort {

    public static String[] selectionSort(String[] input) {
        for (int i = 0; i < input.length; i++) {
            int smallestPos = i;
            for (int j = i; j < input.length; j++) {
                if (input[smallestPos].compareTo(input[j]) > 0) {
                    smallestPos = j;
                }
            }
            if (smallestPos != i) {
                String temp = input[i];
                input[i] = input[smallestPos];
                input[smallestPos] = temp;
            }

        }
        return input;
    }
}
