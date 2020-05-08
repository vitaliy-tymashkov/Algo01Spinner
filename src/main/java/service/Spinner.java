package service;

public class Spinner {

    //Implement method that spins provided int array n positions.
    public static int[] spinArray(int[] array, int n) {

        int arrayLength = array.length;
        n = n % arrayLength;
        int[] result = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            if (i < n) {
                result[i] = array[arrayLength - n + i];
            } else {
                result[i] = array[i - n];
            }
        }
        return result;
    }


    public static int[] spinPatryk(int[] array, int n) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[(n + i) % array.length] = array[i];
        }
        return result;
    }

    public static int[] spinShehata(int[] param, int spin) {
        if (param == null || param.length == 0)
            return param;
        spin = spin % param.length;
//        System.out.println("Spin:" + spin);
        int[] result = new int[param.length];
        for (int i = 0; i < param.length; i++) {
            int potentialIndex = (param.length + i - spin);
            result[i] = param[potentialIndex < param.length ? potentialIndex : i - spin];
        }
        return result;
    }
}
