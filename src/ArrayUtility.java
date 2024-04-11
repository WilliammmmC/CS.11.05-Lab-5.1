public class ArrayUtility {

    public static void print(int[] array) {
        String printOutput = "";
        for (int i = 0; i < array.length; i++) {
            if(i < array.length -1){
                printOutput += array[i] + ", ";
            }
            else{
                printOutput += array[i];
            }
        }
        System.out.println(printOutput);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        String stringAverage = "";
        stringAverage += average;
        for (int i = 0; i < stringAverage.length(); i++) {
            if (stringAverage.charAt(i) == '.' && i < stringAverage.length() - 3) {
                stringAverage = stringAverage.substring(0,i+3);
            }
            else{
                stringAverage = stringAverage;
            }
        }
        double output = Double.parseDouble(stringAverage);
        return output;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;

    }

    public static int maximum(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int even = 0;
        for(int i : array){
            if(i%2 == 0){
                even ++;
            }
        }
        return even;
    }

    public static int[] reverseOne(int[] array) {
        int[] result = new int[array.length];
        for(int i = 0; i < array.length ; i++){
            result[array.length - i - 1] = array[i];
        }
        return result;
    }

    public static void reverseTwo(int[] array) {
        int[] arrayCopy = new int[array.length];
        for(int i = 0; i<array.length; i++){
            arrayCopy[i] = array[i];
        }
        for(int i = 0; i<array.length; i++){
            array[i] = arrayCopy[array.length - 1 - i];
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        boolean result = false;
        for(int i = 0; i <array.length ; i++){
            if(array[i] == num){
                return true;
            }
        }
        return result;
    }

    public static boolean linearSearchString(String[] array, String str) {
        boolean result = false;
        for(int i = 0; i <array.length ; i++){
            if(array[i] == str){
                return true;
            }
        }
        return result;
    }

    public static void multiplyByTwo(int[] array) {
        for(int i = 0; i < array.length; i++){
            array[i] = array[i]*2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for(int i = 0; i < array.length; i++){
            array[i] = array[i]*n;
        }

    }

    public static String toString(int[] array) {
        String result = "";
        for(int i = 0; i <array.length; i++){
            if(i == array.length -1){
                result += array[i];
            } else {
                result += array[i] + ", ";
            }
        }
        return result;
    }

    public static boolean twoSum(int[] array, int num) {
        for(int i = 0; i < array.length; i++){
            for(int b = i+1; b<array.length; b++){
                if(array[i] + array[b] == num){
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int[] arrayCopy = new int[array.length];
        for(int i = 0; i<array.length; i++) {
            arrayCopy[i] = array[i];
        }
        for(int i = 0; i< array.length; i++){
            if( i == 0) {
                array[i] = arrayCopy[array.length-1];
            } else {
                array[i] = arrayCopy[i - 1];
            }
        }
    }

    public static void shiftLeft(int[] array) {
        int[] arrayCopy = new int[array.length];
        for(int i = 0; i<array.length; i++) {
            arrayCopy[i] = array[i];
        }
        for(int i = 0; i< array.length; i++){
            if( i != array.length - 1){
                array[i] = arrayCopy[i + 1];
            } else {
                array[i] = arrayCopy[0];
            }
        }
    }

    public static void shiftRightNTimes(int[] array, int n) {
        int[] arrayCopy = new int[array.length];
        for(int i = 0; i<array.length; i++) {
            arrayCopy[i] = array[i];
        }
        for(int i = 0; i< array.length; i++){
            if(i - n >= 0) {
                array[i] = arrayCopy[i - n];
            }
            else{
                array[i] = arrayCopy[array.length - n + i];
            }
        }

    }

    public static void shiftLeftNTimes(int[] array, int n) {
        int[] arrayCopy = new int[array.length];
        for(int i = 0; i<array.length; i++) {
            arrayCopy[i] = array[i];
        }
        for(int i = 0; i< array.length; i++){
            if(i + n < array.length) {
                array[i] = arrayCopy[i + n];
            }
            else{
                array[i] = arrayCopy[n + i - array.length];
            }
        }


    }


}
