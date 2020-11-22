
class ArraySum {
	int a[];
	ArraySum(int array[]){
		a = array;
	}
	public int sumArrayElements() {
		int sum = a[0];
		for (int i = 1; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}

}
