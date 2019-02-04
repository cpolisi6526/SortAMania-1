public class Challenges extends SortCompetition {


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
}
