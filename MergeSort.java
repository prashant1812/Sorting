
class MergeSort {
	int mArray [];
	int p ;
	int r;
	MergeSort(int array[], int begin, int end){
		mArray = array;
		p = begin;
		r = end;
		
	}
	
	void mergeSort(int mArray [],int p , int r ) {
		if(p < r) {
			int q = (p+r)/2;
			mergeSort(mArray , p , q );
			mergeSort(mArray , q+1, r );
			merge(mArray , p, q, r);
		}
	}
	void merge(int mArray[], int p, int q, int r) {
		int n1 = q-p;
		int n2 = r-q+1;
		int lArray [] = new int [n1];
		int rArray [] = new int [n2];
		
		for (int i = 0 ; i < n1; i++ ) {
			lArray[i] = mArray[p+i];
		}
		for (int j = 0 ; j < n2; j++ ) {
			rArray[j] = mArray[q+j+1];
		}
		
		int i =0;
		int j =0;
		int k = 0;
		while( i < n1 && j < n2) {	
			if(lArray[i] <= rArray[j]) {
				mArray[k] = lArray[i];
				i++;
				k++;
			
			}
			else {
				mArray[k] = rArray[j];
				j++;
				k++;

			}
		}
		while(i < n1) {
			mArray[k] = lArray[i];
			i++;
			k++;
			
		}
		while(j < n2) {
			mArray[k] = rArray[j];
			j++;
			k++;
		}
	
		
	}
	void print () {
		for (int i =0 ; i < mArray.length; i++) {
			  System.out.print("\t");
        	  System.out.print(mArray[i]);
		}
	}
	

}
