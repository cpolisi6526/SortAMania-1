public class Runner {

    public static void printArr(int[] arr){
        for(int x=0; x<arr.length; x++){
            System.out.println(arr[x] + " ");
        }
    }
    public static void printArr(int[][] arr){
        int col=0;
        for(int x=0; x<arr.length; x++){
            for(int c=0; c<arr.length; c++){
                System.out.println(arr[c][x] + "");
            }
            col++;
            System.out.println(arr[x][col] + "");
        }
    }
    public static void main(String[] args){
        //testing out code for challenge two
        //String[] stringArr  = {"hello","why","challenge","school","sleep","why","zebra","why","and","why","and","i","am","tired"};
       // Challenges f = new Challenges();
        //System.out.println(f.challengeTwo(stringArr, "why"));
        //System.out.println("printing the String array.");
        //for(int i=0;i<stringArr.length;i++){
            //System.out.print(stringArr[i]+" ");
        //}

        /// rand...Arr creates a random arr for each medium

        SortCompetition team8= new Team1SortCompetition();
        int[] randIntArr= sortingUtil.randIntArr(10000);
        String[] stringArr = challengeTwo.randString(10000, 5);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time= System.currentTimeMillis();
        int median= team8.challengeOne(randIntArr);
        time= System.currentTimeMillis()- time;
        System.out.println("Challenge One Time Taken " + time * .001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr);
    }
}
