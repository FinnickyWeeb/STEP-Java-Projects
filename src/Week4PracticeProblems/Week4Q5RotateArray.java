package Week4PracticeProblems;

import java.util.*;

public class Week4Q5RotateArray {

    static int[] rotateArray(int[] nums, int k) {
        k = k % nums.length;

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[(i + k) % nums.length] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println(Arrays.toString(rotateArray(nums, k)));
    }
}