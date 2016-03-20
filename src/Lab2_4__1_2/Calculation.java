package Lab2_4__1_2;

import java.util.Random;

/**
 * Created by Alex on 20.03.2016.
 */
public class Calculation {
    public static void calculation() {
        int calculation1, calculation2;
        int[] arr1 = new int[5];
        int[] arr2 = new int[10];

        Random random = new Random();
        for (int addArr : arr1) {
            addArr = random.nextInt();
        }
        for (int addArr : arr2) {
            addArr = random.nextInt();
        }
        System.out.println(arr1);
        System.out.println(arr2);

        calculation1 = (MyMath.findMax(arr1) + MyMath.findMin(arr1));
        calculation2 = (MyMath.findMax(arr2) + MyMath.findMin(arr2));

        System.out.println(calculation1);
        System.out.println(calculation2);

    }


    public String toString(int[] arr) {
        String arrayToString = "";
        for (int i = 0; i < arr1.length; i++) {
            arrayToString = arr[i] + " ";

        }

        return arrayToString;
    }
}
