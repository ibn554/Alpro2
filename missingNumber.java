public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 10};
        int[] b = new int[arr[arr.length - 1] + 1];
        for (int i = 0; i < arr.length; i++) {
            b[arr[i]] = 1;
        }
        for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
            if (b[i] == 0) {
                System.out.println("Bilangan yang hilang: " + i);

            }
        }
    }
}