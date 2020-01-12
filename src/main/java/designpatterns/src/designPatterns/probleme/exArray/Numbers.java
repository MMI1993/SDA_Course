package main.java.designpatterns.src.designPatterns.probleme.exArray;
/*

 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(productArr(arr)));
    }

    public static int[] productArr(int[] arr) {
        int prod = 1;
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            prod *= arr[i];
         if (prod==0)
             return arr;
        for (int i = 0; i < arr.length; i++)
            result[i] = prod / arr[i];
        return result;
    }
}