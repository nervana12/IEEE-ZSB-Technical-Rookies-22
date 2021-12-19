package ieee;

public class binarySearch{
    public static void main(String args[]){
        BinarySearch ob = new BinarySearch();
	int arr[] = { 2, 3, 4, 10, 18, 29, 33, 40, 48};    //sorted
	int n = arr.length;
	int x = 29;
	int result = ob.binarySearch(arr, 0, n - 1, x);
	if (result == -1)
            System.out.println("Element not present");
	else
            System.out.println("Element found at index "+ result);
    }
    public static class BinarySearch {
	// Returns index of x if it is present in arr[l..r], else return -1
	int binarySearch(int arr[], int l, int r, int x){
            if (r >= l) {
		int mid = l + (r - l) / 2;
                if (arr[mid] == x)
                    return mid;
                if (arr[mid] > x)
                    return binarySearch(arr, l, mid - 1, x);
                return binarySearch(arr, mid + 1, r, x);
            }
            //element is not presentin array
            return -1;
	}

    }
}
