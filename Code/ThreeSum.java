import java.util.*;


public class ThreeSum {
	public static void main(String[] args) {
		int[] nums = {0,0,0,0};
		List<List<Integer>> re = threeSum(nums);
	}
	public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        for(int i=0; i<nums.length; i++){
            if((i>0)&&(nums[i] == nums[i-1])) continue;
            int num = nums[i];
            int target = -num;
            HashMap<Integer, Integer> dic= new HashMap<Integer, Integer>();
            for(int j=i+1; j<nums.length; j++){
                if((j>i+2)&&(nums[j] == nums[j-1]) ){
                    if((dic.containsKey(target - nums[j]) && (target/2)!=nums[j]) || ((j>i+2)&&(nums[j] == nums[j-1])&&(nums[j] == nums[j-2]))){
                        continue;
                    }
                    
                }
                if(dic.containsKey(target - nums[j])){
                    List<List<Integer>> temp = new LinkedList<>();
                    temp.add(Arrays.asList(nums[i], nums[j], (target - nums[j])));
                    result.addAll(temp);
                    dic.put(nums[j], j);
                }else{
                	dic.put(nums[j], j);
                }
            }
        }
    return result;
    }
}
