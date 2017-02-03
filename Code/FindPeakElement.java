public int findPeakElement(int[] nums) {
        int len = nums.length;
        if(len == 1) return 0;
        int head=0, tail=nums.length-1, mid=0;
        while(head<tail){
            mid = head+(tail-head)/2;
            if(nums[mid]<=nums[mid+1]) head = mid+1;
            else tail = mid;
        }
        return head;
    }