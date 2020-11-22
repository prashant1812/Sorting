
public class InsertionSort {
	int iArray[];
	InsertionSort(int array []){
		iArray = array;
	}
	
	int [] insertionSort() {
		for (int j = 1; j< iArray.length; j++) {
			int key = iArray[j];
			int i = j-1;
			while(i >=0 && key < iArray[i]) {
				iArray[i+1] = iArray[i];
				i -=1;
			}
			iArray[i+1] = key;	
		}
		return iArray;
	}

}
