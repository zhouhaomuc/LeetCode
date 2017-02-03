public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        int head = 0, tail = nums.length-1, mid = 0;
        while(head < tail){
            mid = head + (tail - head)/2;
            if(nums[mid]<nums[tail]){
                if((target>nums[mid]) && (target<=nums[tail])) head = mid+1;
                else tail = mid;
            }else {
                if((target>=nums[head]) && (target<=nums[mid])) {
                    tail = mid;
                }
                else head = mid+1;
            }
        }
    return (nums[tail] == target)?tail:-1;
    }