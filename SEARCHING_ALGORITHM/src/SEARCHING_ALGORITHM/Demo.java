
package SEARCHING_ALGORITHM;
public class Demo {
	public static void main(String[] args) {
		/**linearsearch_example we  will be having a list of element ,and      we will be finding them
		 * binary search we are going for sorted array because it is needed, otherwise for linear 
		 * **/
		//int nums[ ]= {1,2,3,5,7,9,10,11,13,};
		int nums[]= new int[10000];
		int target = 900;
		
		
		int result1 = linearSearch(nums, target);
		//int Result= BinarySearch(nums, target);
		
		if (result1 != -1) {
			System.out.println("Element found at index: "+ result1);
			
		}
		else {
			System.err.println("element not found");
		}
		
	}


	
	public void name() {
		
	} static int linearSearch(int[] nums, int target) {
		int steps = 0;
		for (int i = 0; i < nums.length; i++) {
			steps++;
			 if(nums[i] == target) { 
				 System.out.println("steps taken by linear:" + steps);
				 return i;}
		}
		System.out.println("steps taken by linear:" + steps);
		
		return -1;
	}
	
	

	
	public void name1() {
		
	} static int BinarySearch(int[] nums, int target) {
		//5,7,9,11,13, starting point and ending point 
		int steps=0;
		int left =0;
		 int right =nums.length-1;
		 
		while (left <= right) {
			steps++;
			int mid = (left + right)/2;
			if (nums[mid]== target) {
				System.out.println("steps taken by binary:" + steps);
				return mid;
			}
			else if (nums[mid] < target) {
				 left =mid +1 ;
			}
			else 
				right = mid -1;
			
		}
		System.out.println("steps taken by binary:" + steps);
		return -1;
	}

   
}
