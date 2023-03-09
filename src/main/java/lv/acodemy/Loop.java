package lv.acodemy;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Loop {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

                /*

                for (int i = 0: i < 10: i++) {
                // define counter:
                // condition
                // increment
                 */

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world!");
        }

        //numbers[0] = 1;
        //numbers[1] = 2;

        for (int i = 10; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }


        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        for(int number : numbers) {
            System.out.println(number);
        }

        // Create String array with 10 names
        // Print all names using for & for each



        String[] names = {"Anna", "John", "Eva", "Bob", "Tifanny", "Peter", "Andrew", "Michael", "Ted", "Emma"};
        for (int i = 0; i < names.length; i++) {
            if (!names[i].equals("Eva")) {
                System.out.println(names[i]);
            }

            System.out.println(names[i]);
        }

        for (String name: names) {
            System.out.println(name);
        }

        //do, do while

        /*
        do {
        // code to be executed
        }(while is true)
         */

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        int x = 0;

        while (x <= 10) {
            System.out.println(x);
            x++;
        }

        int[] array0fNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] emptyArray = new int[array0fNum.length];

        // move numbers from array0fNum to emptyArray using loop
        for (int j = 0; j < array0fNum.length; j++) {
            emptyArray[j] = array0fNum[j];

            System.out.println(Arrays.toString(emptyArray));
        }


    }
}
