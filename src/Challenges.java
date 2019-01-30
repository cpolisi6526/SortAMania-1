public class Challenges extends SortCompetition {
    public static int challengeOne(int[] arr){

    }

    public static int challengeFour(int[][] arr){
       /// Data Set - a multi-dimensional array int[1000][1000] all elements are random integers between 0-10000
        // Task: Sort each sub-array and then sort the arrays by their median value
        // Return the median of the median array
        for(int row=0; row<arr.length; row++){
            sorts.selection(arr[row]);
        }

    }
}
