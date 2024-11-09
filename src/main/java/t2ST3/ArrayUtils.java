package t2ST3;

/*T2ST3 – ArrayElemente vertauschen
Implementieren Sie eine Klasse mit folgenden statischen Methoden:
        • void swapInPlace(int[] iArray)
            - vertauscht die Elemente von iArray innerhalb von iArray
        • int[] swap(int[] iArray)
            - gibt ein neues int[] zurück in welchem die Elemente von iArray in umgekehrter
              Reihenfolge gespeichert sind
        • void printArray(int[] iArray)
            - gibt die Elemente von iArray auf der Konsole aus*/

import java.util.Arrays;

public class ArrayUtils {
    public static void swapInPlace(int[] iArray) {
        int left = 0;
        int right = iArray.length - 1;

        while (left < right) {
            // c = a
            int temp = iArray[left];
            // a = b
            iArray[left] = iArray[right];
            // b = c
            iArray[right] = temp;

            left++;
            right--;
        }
    }


    public static int[] swap(int[] iArray) {
        
        int[] reversedArray = new int[iArray.length];
        for (int i = 0; i < iArray.length; i++) {
            reversedArray[i] = iArray[iArray.length - 1 - i];

        }
        return reversedArray;

    }

    public static void printArray(int[] iArray) {
        System.out.println(Arrays.toString(iArray));
    }
}
