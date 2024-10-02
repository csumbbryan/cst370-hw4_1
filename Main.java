/*
 * INSTRUCTION:
 *     This is a Java staring code for hw4_1.
 *     When you finish the development, download this file and and submit to Canvas
 *     according to the submission instructions.

 *     Please DO NOT change the name of the main class "Main"
 */

// Finish the head comment with Abstract, Name, and Date.
/*
 * Abstract: The program ensures negative numbers always precede positive numbers in an array. Two approaches are used
 * to sort the array, with the first having comparison done outside in, and the second using a sequential iterative approach.
 * Name: Bryan Zanoli
 * Date: 10/01/2024
 */

import java.util.Scanner;

class Main
{
    public static void main(String[] args) {

        // Develop your program here.
        // The following is just a sample statement and and you need to replace it with your code

        //First Approach: use i and j. i points to first number and j points to last number
        //On i is positive, stop, the check j, if j is positive, decrement, otherwise swap
        //Increment i on above
        //If i is negative, increment i

        Scanner scanner = new Scanner(System.in);

        int count  = Integer.parseInt(scanner.nextLine());
        //int count = 100;
        String line = scanner.nextLine();
        //String line = "1 -2 3 -4 5 -6 7 -8 9 -10 11 -12 13 -14 15 -16 17 -18 19 -20 21 -22 23 -24 25 -26 27 -28 29 -30 31 -32 33 -34 35 -36 37 -38 39 -40 41 -42 43 -44 45 -46 47 -48 49 -50 51 -52 53 -54 55 -56 57 -58 59 -60 61 -62 63 -64 65 -66 67 -68 69 -70 71 -72 73 -74 75 -76 77 -78 79 -80 81 -82 83 -84 85 -86 87 -88 89 -90 91 -92 93 -94 95 -96 97 -98 99 -100";
        //System.out.println(line);
        int[] arr1 = new int[count];
        int[] arr2 = new int[count];
        String[] strArr = line.split(" ");
        for (int i = 0; i < count; i++) {
            arr1[i] = Integer.parseInt(strArr[i]);
        }
        System.arraycopy(arr1, 0, arr2, 0, count);

        int i = 0;
        int j = arr1.length - 1;

        while (i < j && i < arr1.length && j >= 0) {
            if (arr1[i] > 0) {
                if (arr1[j] > 0) {
                    j--;
                } else {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
            if (arr1[i] < 0) {
                i++;
            }
        }

        //System.out.println("First Approach: ");
        for (int k = 0; k < count; k++) {
            if(k == count - 1) {
                System.out.print(arr1[k]);
            } else {
                System.out.print(arr1[k] + " ");
            }
        }

        //Second Approach: Use i and j with i and j pointing to the first number.
        //If i is positive, increment j
        //If j is negative, swap values at i and j
        //Once swapped, increment i and j

        i = 0;
        j = 0;

        while (j < arr2.length) {
            if (i == j && arr2[i] < 0) {
                i++;
                j++;
                continue;
            }
            if (i == j && arr2[i] >= 0) {
                j++;
                continue;
            }
            if (arr2[j] > 0) {
                j++;
                continue;
            }
            if (arr2[i] >= 0 && arr2[j] < 0) {
                int temp = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = temp;
                i++;
                j++;
            }
        }
        System.out.println("");
        for (int k = 0; k < count; k++) {
            System.out.print(arr2[k] + " ");
        }
    }
}

