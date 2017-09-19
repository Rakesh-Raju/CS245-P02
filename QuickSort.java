/*
 *@author Rakesh Raju
 *9/18/2017 
 *
 */
package practice3;

public class QuickSort implements SortingAlgorithm {

	public void sort(int[] a) {
		int min = 0;
		int max = a.length - 1;

		sort(a, min, max);
	}

	public void sort(int[] a, int min, int max) {
		if (min < max) {
			int split = divide(a, min, max);
			sort(a, min, split - 1);
			sort(a, split + 1, max);
		}

	}

	public int divide(int[] a, int min, int max) {
		int split = a[max];
		int i = min - 1;

		for (int j = min; j < max; j++) {

			if (a[j] <= split) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}

		int temp = a[i + 1];
		a[i + 1] = a[max];
		a[max] = temp;

		return i + 1;

	}

}
