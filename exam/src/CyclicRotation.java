public class CyclicRotation {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        cyclicallyRotate(arr1, 2);
        printArray(arr1);

        int[] arr2 = {2, 3, 4, 5, 1};
        cyclicallyRotate(arr2, 2);
        printArray(arr2);
    }

    public static void cyclicallyRotate(int[] arr, int rotations) {
        int n = arr.length;
        rotations %= n; // Handle cases where rotations > n

        int[] temp = new int[rotations];
        for (int i = 0; i < rotations; i++) {
            temp[i] = arr[n - rotations + i];
        }

        for (int i = n - rotations - 1; i >= 0; i--) {
            arr[i + rotations] = arr[i];
        }

        for (int i = 0; i < rotations; i++) {
            arr[i] = temp[i];
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
