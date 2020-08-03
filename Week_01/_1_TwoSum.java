package easy;

import java.util.Arrays;

public class _1_TwoSum {
/*    给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

             

    示例:

    给定 nums = [2, 7, 11, 15], target = 9

    因为 nums[0] + nums[1] = 2 + 7 = 9
    所以返回 [0, 1]

    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/two-sum
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

    /**
     * Version 1.0
     * 执行结果：通过
     * 显示详情
     * 执行用时：66 ms, 在所有 Java 提交中击败了37.67%的用户
     * 内存消耗：40.4 MB, 在所有 Java 提交中击败了5.06%的用户
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < result.length; i++) {
            result[i] = 0;
        }

        for (int j = 0; j < nums.length; j++) {
            for (int i = j + 1; i < nums.length; i++) {
                if ((nums[j] + nums[i]) == target) {
                    result[0] = j;
                    result[1] = i;
                    return result;
                }
            }
        }

        return result;
    }

    /**
     * Version 2.0
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        int[] result = {0, 0};

        for (int j = 0; j < nums.length; j++) {
            for (int i = j + 1; i < nums.length; i++) {
                if ((nums[j] + nums[i]) == target) {
                    result[0] = j;
                    result[1] = i;
                    return result;
                }
            }
        }

        return result;
    }

    public static int[] twoSum3(int[] nums, int target) {
        int[] result = {0, 0};
        Arrays.sort(nums);
        int length = nums.length;
        of:for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i]>target){
                    break of;
                }
                if (nums[i] + nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                    break of;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        /*int[] nums = {2,7,11,15};
        int target = 9;*/
        int[] nums = {1, 2, 3, 4};
        int target = 7;
        int result[] = twoSum2(nums, target);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
