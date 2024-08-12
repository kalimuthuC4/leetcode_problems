class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] r = new int[nums.length];
        
        // Initialize the result array with 1s
        Arrays.fill(r, 1);

        // Calculate the product of elements before each index
        int prefixProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            r[i] = prefixProduct;
            prefixProduct *= nums[i];
        }

        // Calculate the product of elements after each index and multiply with the previous product
        int postfixProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            r[i] *= postfixProduct;
            postfixProduct *= nums[i];
        }

        return r;
    }
}
