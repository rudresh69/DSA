public class SelectionSort {
    public static void main(String[] args) {
        int[] list = {64, 25, 12, 22, 11};

        for (int i = 0; i < list.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[min]) {
                    min = j;
                }
            }

            int temp = list[min];
            list[min] = list[i];
            list[i] = temp;
        }

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
