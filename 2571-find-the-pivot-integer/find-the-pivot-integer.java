public class Solution {
    public int sum(int low, int high) {
        int ans = 0;
        for (int i = low; i <= high; i++) {
            ans += i;
        }
        return ans;
    }

    public int pivotInteger(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sum(1, mid) == sum(mid, n)) {
                return mid;
            } else if (sum(1, mid) > sum(mid, n)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}