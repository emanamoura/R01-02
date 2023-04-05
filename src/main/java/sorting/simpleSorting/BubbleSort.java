package sorting.simpleSorting;

import sorting.AbstractSorting;
import util.Util;

/**
 * The bubble sort algorithm iterates over the array multiple times, pushing big
 * elements to the right by swapping adjacent elements, until the array is
 * sorted.
 */
public class BubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if(leftIndex < rightIndex) {
			for (int j = leftIndex; j < rightIndex; j++) {
				for (int i = leftIndex; i < rightIndex - j; i++) {
					T previousElement = array[i];
					if (previousElement.compareTo(array[i + 1]) > 0) {
						Util.swap(array, i, i + 1);
					}
				}
			}
		}
	}
}
