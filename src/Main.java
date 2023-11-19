import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int [] arr1 = new int [] {1, 2, 3};
        float [] arr2 = {1.57f, 7.654f, 9.986f};
        char [] arr3 = new char[]{'a', 'b', 'c', 'd'};

        System.out.println("Задача 2");
        System.out.println(Arrays.toString(arr1)); // print without brackets Arrays.toString(arr1).replaceAll("[\\[\\]]", "");
        System.out.println(Arrays.toString(arr2)); // print without brackets Arrays.toString(arr2).replaceAll("[\\[\\]]", "");
        System.out.println(Arrays.toString(arr3)); // print without brackets Arrays.toString(arr3).replaceAll("[\\[\\]]", "");

        System.out.println("Задача 3");
        for (int i = arr1.length - 1; i >= 0; i--){
            System.out.print(arr1[i]);
            if (i != 0) {System.out.print(", ");}
            else{System.out.println();}
        }
        for (int i = arr2.length - 1; i >= 0; i--){
            System.out.print(arr2[i]);
            if (i != 0) {System.out.print(", ");}
            else{System.out.println();}
        }
        for (int i = arr3.length - 1; i >= 0; i--){
            System.out.print(arr3[i]);
            if (i != 0) {System.out.print(", ");}
            else{System.out.println();}
        }

        System.out.println("Задача 4");
        for (int i = 0; i < arr1.length; i++)
        {
            if (arr1[i] % 2 == 1){
                arr1[i]++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}