public class sorts {
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
