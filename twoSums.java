package leetcode;

public class twoSums {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {2,7,11,15};
        int target = 9;
        int[] result1 = solution.twoSum(nums1, target);
        if(result1 != null){
            System.out.println("output " + result1[0] + "," + result1[1]);
        }else {
            System.out.println("no solution found");
        }

        int[] nums2 = {3,2,4};
        int target1 = 6;
        int[] result2 = solution.twoSum(nums2, target1);
        if(result2 != null){
            System.out.println("output " + result2[0] + "," + result2[1]);
        }else {
            System.out.println("no solution found");
        }

        int[] nums3 = {3,3};
        int target2 = 6;
        int[] result3 = solution.twoSum(nums3, target2);
        if(result3 != null){
            System.out.println("output " + result3[0] + "," + result3[1]);
        }else {
            System.out.println("no solution found");
        }
    }
}
