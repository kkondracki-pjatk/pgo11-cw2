public class zadanie3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3};

        printArray(rotateArray(array1, 2));
        printArray(rotateArray(array2, 3));
    }

    public static int[] rotateArray(int[] array, int positions) {
        int n = array.length;
        positions = positions % n;

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[(i + positions) % n] = array[i];
        }

        return result;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}