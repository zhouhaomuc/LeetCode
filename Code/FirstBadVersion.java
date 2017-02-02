public int firstBadVersion(int n) {
        int head = 1, tail = n, mid = 0;
        while(head<tail){
            mid = head + (tail-head)/2;
            if(!isBadVersion(mid)) head = mid + 1;
            else tail = mid;
        }
    return head;
    }