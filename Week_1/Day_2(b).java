class Solution {
    public double findMaxAverage(int[] nums, int k) {
         double maxAverage = -100000;

        for(int i = 0; i <= nums.length - k; i++) {

            int sum = 0;

            for(int j = i; j < i + k; j++) {
                sum = sum + nums[j];
            }

            double average = (double) sum / k;

            if(average > maxAverage) {
                maxAverage = average;
            }
        }

        return maxAverage;
    }
}
    
