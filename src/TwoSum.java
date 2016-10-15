
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//run twoSum
		int[] a = {1,2,3,4,7,5,5};
		int target = 9;
		int[] result;
		result = twoSum(a,target);
		System.out.println(result[0]);
		System.out.println(result[1]);
		
		//change to test
		//change again
		
	}
	public static int[] twoSum(int[] nums, int target) {
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] == target - nums[i]) {
	                return new int[] { i, j };
	            }
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
}
