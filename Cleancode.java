public class Cleancode{
    static class Number {

        int min;
        int max;
    }

    static Number SmallestAndGreater(int arr[], int count) {
        Number digit = new Number();

        if (count == 1) {
            digit.max = arr[0];
            digit.min = arr[0];
            return digit;
        }

        if (arr[0] > arr[1]) {
            digit.max = arr[0];
            digit.min = arr[1];
        } else {
            digit.max = arr[1];
            digit.min = arr[0];
        }

        for (int i = 2; i < count; i++) {
            if (arr[i] > digit.max) {
                digit.max = arr[i];
            } else if (arr[i] < digit.min)
            {
                digit.min = arr[i];
            }
        }

        return digit;
    }

    public static void main(String args[]) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int s = 6;
        Number digit = SmallestAndGreater(arr, s);
        System.out.printf("\n Minimum  is %d", digit.min);
        System.out.printf("\n Maximum is %d\n", digit.max);
    }
}
