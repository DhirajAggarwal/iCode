package programs;

public class TwoSums {

	public static void main(String[] args) {
		TwoSums ts = new TwoSums();
		int[] arr = { 4, 90, 85, -1, -5 };
		int[] indics = ts.twoSum(arr, -1);
		ts.printArray(indics);
	}

	public void printArray(int[] array) {
		for (int singleArrayValue : array) {
			System.out.println(singleArrayValue);
		}
	}

	public int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] + nums[j] == target && nums[i] != nums[j]) {
					arr[0] = j;
					arr[1] = i;
				}
			}
		}
		return arr;
	}
}
