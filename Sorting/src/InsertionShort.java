
public class InsertionShort {
    public static void main(String[] args) {
        int[] arr = {87, 45, 21, 32, 6, 5, 1, 2, 84};

        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];   // current element jisko insert karna hai
            int j = i - 1;      // sorted part ka last index

            // shift elements of sorted part jo key se bade hain
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // correct position par key ko daal do
            arr[j + 1] = key;
        }

        // print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
