/*
 *@author Rakesh Raju
 *9/18/2017 
 *
 */
package practice3;

public class MergeSort implements SortingAlgorithm {

	public void sort(int[] a) {

		sort(a, 0, a.length - 1);
	}

	public void sort(int a[], int min, int max) {
		if (min < max) {
			int mid = (min + max) / 2;

			sort(a, min, mid);
			sort(a, mid + 1, max);

			merge(a, min, mid, max);
		}
	}

	public void merge(int[] a, int min, int mid, int max) {
		int size1 = mid - min + 1;
		int size2 = max - mid;

		int[] half1 = new int[size1];
		int[] half2 = new int[size2];

		for (int i = 0; i < size1; ++i) {
			half1[i] = a[min + 1];
		}

		for (int i = 0; i < size2; ++i) {
			half2[i] = a[mid + 1 + i];
		}

		int i = 0;
		int j = 0;
		int k = min;

		while (i < size1 && j < size2) {
			if (half1[i] <= half2[j]) {
				a[k] = half1[i];
				i++;
			}

			else {
				a[k] = half2[j];
				j++;
			}

			k++;
		}

		while (i < size1) {
			a[k] = half1[i];
			i++;
			k++;
		}

		while (j < size2) {
			a[k] = half2[j];
			j++;
			k++;
		}

	}

}
