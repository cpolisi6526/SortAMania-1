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
      //  challengeFive: Mystery Sort and Search
      //  Data Set - an array of 10,000 objects that implement the comparable interface
        //Task: Sort the array by the compareTo method, and determine if it contains the element given. Return the position of the object, or -1 if not found.
//        Hint: You must use a stable sort for this challenge, equivalent objects should stay in the same order.

        return 1;

    }

    public Thingy[] randomThingArr(int num){
        Thingy[] things= new Thingy[num];
        for(int i=0; i<num;i++){
            things[i]= new Thingy();
        }
        return things;
    }
    public String greeting(){
        return "hello";

    }
}
