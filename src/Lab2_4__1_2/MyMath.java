package Lab2_4__1_2;

/**
 * Created by Alex on 19.02.2016.
 */
public class MyMath {

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int arrElement : arr) {
            if (arrElement < min) {
                min = arrElement;
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];

        }
        return max;
    }
}