public class ArrayFunctions {
    public static double averageOfEvens(int[][] arr) {
        int count = 0;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] % 2 == 0) {
                    count++;
                    total += arr[i][j];
                }
            }
        }
        return total/count;
    }

    public static double averageOfEvens(int[][] arr, int[] array) {
        int count = 0;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] % 2 == 0) {
                    count++;
                    total += arr[i][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(array[i] % 2 == 0) {
                count++;
                total += array[i];
            }
        }
        return total/count;
    }

    public static int countWordsStartingWithChar(String[] arr, char c) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].charAt(0) == c) {
                count++;
            }
        }
        return count;
    }

    public static int[] flattenArray(int[][] arr) {
        int size = 0;
        for(int i = 0; i < arr.length; i++) {
            size += arr[i].length;
        }
        int[] flattened = new int[size];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                flattened[k] = arr[i][j];
                k++;
            }
        }

        return flattened;
    }
}
