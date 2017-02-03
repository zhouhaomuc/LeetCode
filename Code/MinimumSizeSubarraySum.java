public int minSubArrayLen(int s, int[] nums) {
        if(nums.length <= 0) return 0;
        int i=0, j = 0, min = Integer.MAX_VALUE, sum = 0;
        for(i=0; i<nums.length; i++){
            sum += nums[i];
            
            while(sum >= s){
                min = (min>(i-j+1))?(i-j+1):min;
                sum -= nums[j];
                j++;
            }
        }
    return (min<Integer.MAX_VALUE)?min:0;
    }