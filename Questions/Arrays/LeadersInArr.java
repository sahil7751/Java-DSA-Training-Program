import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] nums = { 10, 22, 12, 3, 0, 6 };
        int n = nums.length;

        ArrayList<Integer> Leaders = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                Leaders.add(nums[i]);
            }
        }
        for (int num : Leaders) {
            System.out.print(num + " ");
        }

    }
}