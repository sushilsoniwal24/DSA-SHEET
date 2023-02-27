import java.util.Arrays;

public class P_01_Reverse_Array {

    // T.C = O(n) & S.C = O(n).
    public static void reverse1(int[] arr) {
        int n = arr.length, idx = n - 1;
        int[] temp = new int[n];
        for (int num : arr) {
            temp[idx--] = num;
        }
        System.arraycopy(temp, 0, arr, 0, n);
    }

    // T.C = O(n) & S.C = O(1).
    public static void reverse2(int[] arr) {
        int n = arr.length, start_idx = 0, end_idx = n - 1, temp;
        while (start_idx < end_idx) {
            temp = arr[start_idx];
            arr[start_idx] = arr[end_idx];
            arr[end_idx] = temp;
            start_idx++;
            end_idx--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
