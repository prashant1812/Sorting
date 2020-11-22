
class BinarySearch {
	      public int index = 0;
	      public int search(int [] array, int first , int last, int item ) {
			int mid = (first + last) / 2 ;
			if(item == array[last]) {
				return last;
			}
			if(item == array[mid]) {
				return mid;
			}
			if(first == mid && array[mid] != item) {
				return -1;
			}
			// element possible range is first half
			else if(item < array[mid]){
				//first = first;
				//last = mid -1;
				return search(array, first, mid -1 , item);
			}
			// element's possible range is second half
			else if(item > array[mid]){
				//first = mid + 1;
				//last = last-1;
				return search(array, mid +1, last , item);
			}	
		 return -1;
	}
}
