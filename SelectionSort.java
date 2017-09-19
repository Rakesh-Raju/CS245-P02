/*
 *@author Rakesh Raju
 *9/18/2017 
 *
 */

package practice3;

public class SelectionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			// Find the minimum element in unsorted array
			int min = i;
			for (int j = i + 1; j < a.length; j++)
				if (a[j] < a[min])
					min = j;

			// Swap the found minimum element with the first
			// element
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}
}
