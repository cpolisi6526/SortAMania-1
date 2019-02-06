public class team8sortingCompetition extends SortCompetition {


    public int challengeOne(int[] arr){
        int medianInd = arr.length/2;
        sorts.bubbleSort(arr);
        return arr[medianInd];

    }
    public int challengeTwo(String[] arr, String query) {
        sorts.bubbleSort(arr);
        int max =arr.length-1;
        int min = 0;
        for (int i = (min+max)/2; min<=max;i=(min+max)/2 ) {
            if (arr[i - 1].equals(query)&& arr[i].equals(query)){
                return i-1;
            }
            if (arr[i].compareTo(query) == 0) {
                return i;
            } else if (arr[i].compareTo(query) > 0) {
                max = i - 1;
            } else if (arr[i].compareTo(query) < 0) {
                min = i + 1;
            }
        }

        //the below code is another way to check for a target string
        //int max =arr.length-1;
        //int min = 0;
        //int guess = (min+max)/2;
        //boolean checker = true;
        //while(min<=max){
           // if(arr[guess-1].equals(query)&& arr[guess].equals(query)){
               // return guess-1;
            //}
            //else if(arr[guess].equals(query)){
               // return guess;
            //}
            //else if(arr[guess].compareTo(query)>0){
               // max = guess-1;
               // guess = (min+max)/2;
           // }
           // else if(arr[guess].compareTo(query)<0){
                //min=guess+1;
                //guess=(min+max)/2;
            //}
       // }
        return -1;

    }

    public int challengeThree(int[] arr){
        sorts.insertion(arr);
        return(sorts.findMed(arr));
    }

    public int challengeFour(int[][] arr){
       /// Data Set - a multi-dimensional array int[1000][1000] all elements are random integers between 0-10000
        // Task: Sort each sub-array and then sort the arrays by their median value
        // Return the median of the median array
        for(int row=0; row<arr.length; row++){
            sorts.selection(arr[row]);
        }
        int[] medians= new int[arr.length];
        for (int row=0; row<arr.length; row++){
            sorts.findMed(arr[row]);
        }
        return(sorts.findMed(medians));
    }
    public int challengeFive(Comparable[] arr, Comparable query){
        return 1;

    }
    public String greeting(){
        return "hello";

    }



    ///sorting utilities
    //swap method for integers
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //swap method for strings
    public static void swap(String[] arr, int a, int b) {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //swap method for doubles
    public static void swap(double[] arr, int a, int b) {
        double temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //creates an random array, length count, and fills with numbers from 0 and 10000
    public static int[] randIntArr(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10001);
        }
        return arr;
    }

    //creates a random array of doubles
    public static double[] randDoubleArr(int count) {
        double[] arr = new double[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (double) (Math.random() * 101);
        }
        return arr;
    }

    //checks whether the array is sorted or not.
    //this is only for arrays that have integer values in it
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //checks whether an array with doubles are sorted
    public static boolean isSorted(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //checks whether the array is sorted by comparing the sum of the unsorted array and the sum of the sorted array.
    //If the sums are the same that means that nothing happened to the elements in the original array(unsorted array)
    //well for the most part it means nothing happened
    public static boolean checkSum(int[] before, int[] after) {
        int beforeSum = 0;
        int afterSum = 0;
        for (int i = 0; i < before.length; i++) {
            beforeSum = beforeSum + before[i];
        }
        for (int j = 0; j < after.length; j++) {
            afterSum = afterSum + after[j];
        }
        return (beforeSum == afterSum);
    }

    //checks the sum of the original array and the sorted array
    public static boolean checkSum(double[] before, double[] after) {
        double beforeSum = 0;
        for (int i = 0; i < before.length; i++) {
            beforeSum = beforeSum + before[i];
        }
        double afterSum = 0;
        for (int j = 0; j < after.length; j++) {
            afterSum = afterSum + after[j];
        }
        return (beforeSum == afterSum);
    }

    //method to create copy of an int Array
    public static int[] copyOfArray(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    //method to create copy of a string array
    public static String[] copyOfArray(String[] arr) {
        String[] copy = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    //method to create copy of a double array
    public static double[] copyOfArray(double[] arr) {
        double[] copy = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    //method to generate an array of random strings
    public static String[] randomStringArr(int num, int length) {
        String[] arr = new String[num];
        while (num > 0) {
            int i = 0;
            String s = "";
            while (i < length) {
                char c = (char) ((Math.random() * 26) + 97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }

    public static int min(int arr[], int ind) {
        int minInd = ind;
        for (int i = ind; i < arr.length; i++) {
            if (arr[i] < arr[minInd]) {
                swap(arr, i, minInd);
                minInd = i;
            }
        }
        return minInd;
    }

    public static int[] ranIntArr(int count){
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        return arr;
    }



    //sorts
    public static void selection(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            index = sortingUtil.min(arr, i);
            if (arr[i] > arr[index]) {
                sortingUtil.swap(arr, i, index);
            }
        }
    }

    public static void insertion(int[] arr) {
        int min=sortingUtil.min(arr,0);
        sortingUtil.swap(arr,0,min);
        for(int i: arr){
            for(int j=1;j<arr.length;j++){
                if(arr[j-1]>arr[j]){
                    sortingUtil.swap(arr,j-1,j);
                }
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i]>arr[i+1]) {
                    sortingUtil.swap(arr, i, i + 1);

                    swap = true;
                }
            }

        }
    }

    public static int findMed(int[] arr) {
        int med = arr.length / 2;
        med = arr[med];
        return med;
    }

    //bubble sort for strings
    public static void bubbleSort(String[] arr){
        for(int i =0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1].compareTo(arr[j])>0) {
                    sortingUtil.swap(arr, j - 1, j);
                }
            }
        }
    }

}
