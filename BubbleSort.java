 
public class BubbleSort {
	int bArray[];
	BubbleSort(int array []) {
		bArray = array;
	}
	int [] bubbleSort() {
		for (int i =0 ; i< bArray.length; i++) {
			for (int j= bArray.length -1; j >= i+1; i--) {
				if(bArray[j] < bArray[j-1]) {
					int temp = bArray[j];
					bArray[j] = bArray[j-1];
					bArray[j-1] = temp;
				}
			}
		}
		
		return bArray;
	}
	

}
