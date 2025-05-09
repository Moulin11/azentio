public class MissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int total = n * (n + 1) / 2;

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return total - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(findMissingNumber(arr));  
    }
}
