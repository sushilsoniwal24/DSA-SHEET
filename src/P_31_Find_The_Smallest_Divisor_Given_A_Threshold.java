public class P_31_Find_The_Smallest_Divisor_Given_A_Threshold {

    // https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/

    // ! T.C = O(n*log(max(nums))) & S.C = O(1)
    public static int smallestDivisor(int[] nums, int threshold) {
        int start = 1, end = (int) 1e6, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            for (int num : nums) {
                sum += Math.ceil(num * 1.0 / mid);
            }
            if (sum > threshold) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
}
