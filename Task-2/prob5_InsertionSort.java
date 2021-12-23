package ieee;

public class prob5_InsertionSort {
    public static void main(String args[]){
        // generate an array of 1000 element randomly
	int[] A = new int[1000];
        for (int i = 0; i<1000; i++){
            int x = (int)(1000*Math.random());
            A[i]=x;
        }
	sort(A);
        PrintArray(A);
    }
    static void sort(int A[]){
	for (int i = 1; i < A.length; ++i) {
            int key = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = key;
	}
    }
    static void PrintArray(int A[]){
	for (int i = 0; i < A.length; ++i)
            System.out.print(A[i] + " ");
        System.out.println();
    }
}
