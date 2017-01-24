import java.util.*;


public class ThreeSum {
	public static void main(String[] args) {
		int[] nums = {0,0,0};
		List<List<Integer>> re = threeSum(nums);
	}
	public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        for(int i=0; i<nums.length-2; i++){
            if((i>0) && (nums[i] == nums[i-1])) continue;
        	else{
        	    int target = -nums[i];
        	    int low = i + 1;
        	    int high = nums.length - 1;
        		while(low < high){
        			if((nums[low] + nums[high]) == target){
        				result.add(Arrays.asList(nums[i], nums[low], nums[high]));
        				low ++;
        				high --;
        				while((nums[low] == nums[low -1]) && (low<high)) low++;
        				while((nums[high] == nums[high+1]) && (low<high)) high--;
        			}else if((nums[low] + nums[high])>target) high --;
        			else low ++;
        		}
        	}
        }
    return result;
    }
}
