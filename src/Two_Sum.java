import java.util.HashMap;

public class Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++)
        {
            int complement = target - nums[i];
            if(map.containsKey(complement))
            {
                return new int[] {map.get(complement), i};
            }
            else
                map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
