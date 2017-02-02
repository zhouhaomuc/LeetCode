public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> re = new ArrayList<List<Integer>>();
        for(int i=0; i<nums.length-3; i++){
            if((i>0) && (nums[i] == nums[i-1])) continue;
            for(int j=i+1; j<nums.length-2; j++){
                if((nums[j] == nums[j-1]) && (j>i+1)) continue;
                int newTar = target - nums[i] - nums[j];
                int slow = j+1, fast = nums.length - 1;
                while(slow<fast){
                    if((nums[slow] + nums[fast])==newTar){
                        re.add(Arrays.asList(nums[i], nums[j], nums[slow], nums[fast]));
                        if(slow<fast){
                            while(((slow+1)<fast) && (nums[slow+1] == nums[slow])) slow++;
                            while(((fast-1)>slow) && (nums[fast-1] == nums[fast])) fast--;
                        }
                        slow = slow+1;
                        fast = fast-1;
                    }
                    if((nums[slow] + nums[fast])<newTar) slow++;
                    if((nums[slow] + nums[fast])>newTar) fast--;
                }
                
                
            }
        }
    return re;
    }