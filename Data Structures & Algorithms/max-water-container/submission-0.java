class Solution {
    public int maxArea(int[] nums) {
        int n = nums.length;
        int mw = 0,i=0,j=n-1;
        while(i<j){
            if(nums[i]<=nums[j]){
                mw = Math.max(nums[i]*(j-i),mw);
                i++;
            }
            else{
                mw = Math.max(nums[j]*(j-i),mw);
                j--;
            }
        }
        return mw;
    }
}
