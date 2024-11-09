package t2ST3;

public class Main {
    public static void main(String[] args) {
        int[] iArray = {0, 1, 2, 4, 8, 16};
        ArrayUtils.swapInPlace(iArray);
        ArrayUtils.printArray(iArray);

        ArrayUtils.swapInPlace(iArray);
        ArrayUtils.printArray(iArray);

        int[] reversedArray = ArrayUtils.swap(iArray);
        ArrayUtils.printArray(reversedArray);

    }

}
