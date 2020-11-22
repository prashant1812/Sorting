import java.util.Scanner;

public class Hello {
		/**
		 * @param args
		 */
		public static void main(String args[]) {
		// TODO Auto-generated method stub
       //  System.out.println("Hello World !!");
        
//         System.out.println("Enter the Number of Elements");
//         int [] arrayInput = new int[] {-1,12,23,34,65};
//         System.out.println("Enter the elements ");
//         int item = 23;
//         BinarySearch bs = new BinarySearch();     
//         int index = bs.search(arrayInput,0, 4,item);
//         if (index  == -1 ) {
//        	 System.out.println(" item " +item + " does not exist");
//         }
//         else {
//        	 System.out.println(" item " +item + " exist at position " + index);
//         }
//         ArraySum as = new ArraySum(arrayInput);
//         int sum = as.sumArrayElements();
//         System.out.println("Sum of elements of array = " +sum);
        
		// Sorting Algorithms
			
         System.out.println("Number of elements to sort Input size = " );
         Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
         int array [] = new int[size];
         for (int i =0 ; i< size ; i++) {
        	 System.out.println("Enter the "+ i + " position element");
        	 array[i] = sc.nextInt();
         }
         
         //int array[] = new int[] {8,-7,6,-5,4,3,2,1};
         //HeapSort
        // int j =0;
        
     //   System.out.println("Enter the choice 1 for IntersionSort 2 for HeapSort");
     //    int ch = sc.nextInt();
       //
         
//        switch(ch){
//        case 2:
//         System.out.println("HeapSort");
//         HeapSort hs = new HeapSort(array);
//         int hArray[] = hs.heapSort(); 
//              for (int i = 0; i < hArray.length; i++) {
//            	  System.out.print("\t");
//            	  System.out.print(hArray[i]);  
//              }
//              break;
//         case 1:
//              
//              //InsertionSort
//              System.out.println("");
//              System.out.println("InsertionSort");	
//              InsertionSort is = new InsertionSort(array);
//              int iArray[] = is.insertionSort();
//              for (int i = 0; i < iArray.length; i++) {
//            	  System.out.print("\t");
//            	  System.out.print(iArray[i]);
//            	 
//              }
//        	 break;
//         default :
//       		 System.out.println("Invalid Choice");
//              
//        }
       // j--;
       
              //BubbleSort
//              System.out.println("");
//              System.out.println("BubbleSort");	
//              BubbleSort bSort = new BubbleSort(array);
//              int bArray[] = bSort.bubbleSort();
//              for (int i = 0; i < bArray.length; i++) {
//            	  System.out.print("\t"); 
//            	  System.out.print(bArray[i]); 
//              }
              
              //MergeSort
              System.out.println("");
              System.out.println("MergeSort");	
              MergeSort ms = new MergeSort(array , 0 , array.length-1);
              ms.mergeSort(array , 0 , array.length -1);
              ms.print();
          
            //QuickSort
              System.out.println("");
              System.out.println("QuickSort");	
              QuickSort qs = new QuickSort(array , 0 , array.length -1);
              qs.quickSort(array, 0, array.length -1);
              qs.print();
              
             //SelectionSort
              
              
              System.out.println("");
              System.out.println("SelectionSort");	
              SelectionSort ss = new SelectionSort(array);
              int sArray[]= ss.selectionSort();
              for (int i = 0; i < sArray.length; i++) {
          	  System.out.print("\t"); 
          	  System.out.print(sArray[i]); 
             }
              
        sc.close();
			
	}

}
