public class zadanie2 {
    public static void main(String[] args) {
        int[] array1 = {3, 3, 3, 2, 2};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {5, 5, 5, 5, 1};

        System.out.println(findDominant(array1));
        System.out.println(findDominant(array2));
        System.out.println(findDominant(array3));
    }

    public static int findDominant(int[] array) {
        int n = array.length;
        int threshold = n / 2;
        int count = 0;
        int candidate = -1;

        for (int num : array) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        count = 0;
        for (int num : array) {
            if (num == candidate) {
                count++;
            }
        }

        return (count > threshold) ? candidate : -1;
    }
}