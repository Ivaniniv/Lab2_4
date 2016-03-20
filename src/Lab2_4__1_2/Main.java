package Lab2_4__1_2;


/**
 * Created by Alex on 19.02.2016.
 */
public class Main {
    public static void main (String [] args){
        int [] array = {1,15,2,3,5};
        int result = MyMath.findMin (array);
        System.out.println(result);
        result = MyMath.findMax (array);
        System.out.println(result);
        new Calculation();
        Calculation.calculation();

    }
}
