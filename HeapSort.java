
public class HeapSort {
	int hArray[];
	HeapSort(int array[]){
		hArray = array;
	}
	
	void maxHeapify(int hArray[], int heapSize, int i ) {
		
		int largest ;
		int l = 2*i +1;
		int r = 2*i+2;
		if(l < heapSize && hArray[i] < hArray[l] ) {
			largest = l;	
		}
		else largest = i;
		if(r < heapSize && hArray[largest] < hArray[r]  ) {
			largest = r;	
		}
		if (largest != i) {
			int temp = hArray[largest];
			hArray[largest] = hArray[i];
			hArray[i] = temp;
			maxHeapify(hArray, heapSize,largest);
		}
	 }
	
	void buildMaxHeap(int hArray[]){
		//int pCount = hArray.length/ 2 -1;
			for(int i = hArray.length/ 2 -1; i>=0 ; i--) {
				maxHeapify(hArray, hArray.length,i);
			}
	}
	public int[] heapSort() {
		buildMaxHeap(hArray);
		for(int i = hArray.length -1; i >= 1 ; i--) {
			int temp = hArray[i];
			hArray[i] = hArray[0];
			hArray[0] = temp; 
			maxHeapify(hArray, i, 0);
		}
		return hArray;
	 }
}
 