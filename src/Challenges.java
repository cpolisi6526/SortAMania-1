public class Challenges extends SortCompetition {

    public int challengeOne(int[] arr){
        int medianInd = arr.length/2;
        sorts.bubbleSort(arr);
        return arr[medianInd];
    }

    public int challengeTwo(String[] arr, String query) {
        bubbleSort.bubbleSortII(elements);
        int max =elements.length-1;
        int min = 0;
        for (int i = (min+max)/2; min<=max;i=(min+max)/2 ) {
            if (elements[i] == target) {
                return i;
            } else if (elements[i] > target) {
                max = i - 1;
            } else if (elements[i] < target) {
                min = i + 1;
            }
        }
        return -1;

    }
    public int challengeThree(int[] arr){

    }

    public int challengeFour(int[][] arr) {
        /// Data Set - a multi-dimensional array int[1000][1000] all elements are random integers between 0-10000
        // Task: Sort each sub-array and then sort the arrays by their median value
        // Return the median of the median array
        for (int row = 0; row < arr.length; row++) {
            sorts.selection(arr[row]);
        }
    }
    public int challengeFive(Comparable[] arr, Comparable query){

    }
    public String greeting(){
    }
}
