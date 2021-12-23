package ieee;

import java.util.*;

public class prob4_MinDistance {
    public static void main(String args[]){
        System.out.println("Enter the length of the list:");
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int[] A = new int[l];
        System.out.println("Enter the elements:");
        for (int i=0;i<l;i++){
            int a = input.nextInt();
            A[i]=a;
            
        }
        System.out.println(MinDistance(A));
    }

    static int MinDistance(int[] a){
        // Create a HashMap to store (key, values) pair.
        HashMap<Integer, Integer> hmap= new HashMap<>();
    	int minDistance = Integer.MAX_VALUE;
	int previousIndex = 0, currentIndex = 0;

	// Traverse the array and find the minimum distance between the same elements with map
	for (int i = 0; i < a.length; i++) {
            if (hmap.containsKey(a[i])) {
		currentIndex = i;
                // Fetch the previous index from map.
                previousIndex = hmap.get(a[i]);
                // Find the minimum distance.
                minDistance= Math.min((currentIndex - previousIndex),minDistance);
            }
            // Update the map.
            hmap.put(a[i], i);
	}
        return (minDistance == Integer.MAX_VALUE? -1: minDistance);
    }
}
