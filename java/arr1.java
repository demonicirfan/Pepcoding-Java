public class arr1 {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        arr[0] = 44;
        arr[1] = 35;
        arr[2] = 21;
        arr[3] = 26;
        arr[4] = 40;

        swap(arr, 0, 4);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

}
