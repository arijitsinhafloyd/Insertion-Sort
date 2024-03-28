This code demonstrates the basic implementation of insertion sort. The key optimization in insertion sort is that it performs fewer swaps compared to other sorting algorithms like bubble sort or selection sort, especially when dealing with partially sorted arrays. The algorithm iterates through the array, comparing each element with the elements before it, and inserting it into its correct position in the sorted portion of the array.

The best case scenario is when the array is sorted [O(n)] so that unnecessary swaps are not performed. The worst case scenario is that when the array is not sorted and it is in descending order, in this case, more swaps are to be performed, making its time complexity to [O(n)^2].

The optimized code of Insertion Sort is given.
