package arrays;

public class Questions {

	public static void main(String[] args) {

		// int array
		// int [] arr = {12,15,8,9,50,21,5,4};

//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}

		// task - 1 : find specific element is present or not

		// 3 is present or not
		// present
//		// not present
//		int [] arr = {12,15,8,9,50,21,5,};
		
		
	
		
		
		
		
		
		
		
		
		
		
//	boolean flag = false;	
//for(int i=0;i<arr.length;i++) {
//	
//	if(arr[i]==3) {   // arr[1] == 3
//		System.out.println("3 is present");
//		flag = true;
//	}
//	
//	
//}
//if(flag==false) {
//System.out.println("3 is not present");
//		
//		
//	}

// 5 present or not . if present show position

// 5 is present at 6 position

	//	int[] arr = { 12, 15, 5, 9, 50, 21,  };
// index              0  1  2  3   4   5   6

//
//for(int index=0;index<arr.length;index++) {
//	System.out.println(index + " element is : "+ arr[index]);
//}

//		boolean flag = false;
//		for (int i = 0; i < arr.length; i++) {
//
//			if (arr[i] == 5) { 
//				System.out.println("5 is present at : "+ i );
//				flag = true;
//			}
//
//		}
//		if (flag == false) {
//			System.out.println("5 is not present");
//
//		}
		
		
		
	//	int[] arr = { 12, 15, 10, 9, 10, 21, 5 , 5  };	
	// index          0    1   2  3  4  5   6    7
	// count = 0	  0    0  1   1  1  1   2    3
		
//		int count =0;
//		for(int i=0;i<arr.length;i++) {
//		if(arr[i]==100) {
//			count ++;
//		}	
//			
//		}
//		
//		System.out.println("100 is present :"+ count + " times ");
//		
		
		
		
		//
//		int[] arr = { 12, 16, 10, 10, 10, 20, 6 , 4  };	
//		// index          0    1   2  3  4  5   6    7
//		// count = 0  0	  1    1   2   2  3  4   5  
//		
//		int count =0;
//		for(int i=0;i<arr.length;i++) {
//			
//			if(arr[i] %2 ==0) {
//				count++;
//			}
//			
//		}
//		
//		System.out.println(count + " even numbers are present in an array");
//		
		
//		String [] arr = { "shyam","sita","Balram"};
//		
//		int c =0;
//		
//		for(int i=0;i<arr.length;i++) {
//			
//			if(arr[i] == "Ram") {
//				c=1;
//				System.out.println("Ram is present");
//			}
//		}
//		
//		if(c==0) {
//			System.out.println("Ram is not present");
//		}

		
		
		
		// finding maximum element in an array
		
//			int[] arr = { 120, 15, 130, 140, 100,  150, 59 , 45  };	
//		// index          0    1     2    3   4    5    6    7
//// max =0                120   120  130  140  140  150  150  150
		
		// steps : 
		// int max = 0;
		// 1. iterate from first till last index
		// 2. if we found current array element greater than max
		//        then change max to that element
	
		
		int[] arr = { 120, 15, 130, 140, 100,  150, 59 , 45  };	
		// index        0    1    2    3   4    5    6    7
// max =0             120   120  130  140  140  150  150  150
// min =0;		
		
		int max=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max = arr[i];
			}
			
		}
		
		System.out.println(max);
		
		
		
	}
}
