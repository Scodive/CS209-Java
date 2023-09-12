public class T918 {
    public static void main(String[] args) {
        int[] nums ={3,-1,2,-1};
        if (nums == null || nums.length < 1) {
            System.out.println(0);
        }
        int [] A = new int[10];
        int curMax, max, curMin, min, sum;
        curMax  = max = curMin = min = sum = A[0];
        for (int i = 1; i < A.length; i++) {
            sum += A[i];
            curMax = curMax > 0 ? curMax + A[i] : A[i];
            max = curMax > max ? curMax : max;
            curMin = curMin < 0 ? curMin + A[i] : A[i];
            min = curMin < min ? curMin : min;
        }
        if (max < 0)
            System.out.println(max);
        System.out.println(Math.max(sum - min, max));
    }
}
