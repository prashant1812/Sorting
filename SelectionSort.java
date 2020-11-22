
/**
 * @author Prashant Singh
 * SelectionSort(int array[]) constructor initializes the input array
 */
class SelectionSort {
	int sArray[];
	SelectionSort(int array[]){
		sArray = array;
	}
	
   /**
 * @return sArray []
 */
int [] selectionSort() {
	   int min;
	   for(int i =0 ; i< sArray.length -1; i++) {
		   min = i;
		   for(int j = i+1 ; j < sArray.length; j++) {
			   if(sArray[min] > sArray[j]) {
				   min = j;
			   }
			   int temp = sArray[i];
			   sArray[i]= sArray[min];
			   sArray[min] = temp;
		   }
		   
	   }
	   return sArray;
   }
}
