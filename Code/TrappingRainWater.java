public int trap(int[] height) {
        if(height.length<=2) return 0;
        int total=0, head = 0, tail = height.length-1;
        
        while((head<tail-1) && (height[head]<=height[head+1])) head++;
        while((head<tail-1) && (height[tail]<=height[tail-1])) tail--;
        
        int hflag = head, tflag = tail;
        
        while(hflag<=tflag){
            if(height[head]<=height[tail]){
                if(height[head] > height[hflag]) {
                    total += (height[head] - height[hflag]);
                    //System.out.println("flag:"+hflag+"total:"+total);
                    hflag++;
                }else{
                    head = hflag;
                    hflag++;
                }
            }else{
                if(height[tail] > height[tflag]) {
                    total += (height[tail] - height[tflag]);
                    tflag--;
                }else{
                    tail = tflag;
                    tflag--;
                }
            }
        }
        
    return total;
    }
