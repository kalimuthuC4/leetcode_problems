
class Solution {
    public int pivotInteger(int n) {
        int[] a = new int[n];
        for (int i = 1; i <= n; i++) {
            a[i - 1] = i;
        }
        if(n == 1)
        return 1;

        int start = 1;
        int last = n;
        
        while (start <= last) {
           int mid = (start + last) / 2;
            if (sumfunc(1, mid) < sumfunc(mid ,n)) { 
                start = mid + 1;
            } else if (sumfunc(1, mid) == sumfunc(mid, n)) { 
                return mid;
            } else {
                last = mid-1;
            }
            // mid = (start + last) / 2;
        }
        return -1;
    }

    // Moved 'sumfunc' method outside 'pivotInteger' method
    int sumfunc(int f, int l) {
        int s = 0;
        for (int i = f; i <= l; i++) {
            s += i;
        }
        return s;
    }
}
