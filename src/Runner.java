public class Runner {
    public static void main(String[] args){
        //testing out code for challenge two
        //String[] stringArr  = {"hello","why","challenge","school","sleep","why","zebra","why","and","why","and","i","am","tired"};
       // Challenges f = new Challenges();
        //System.out.println(f.challengeTwo(stringArr, "why"));
        //System.out.println("printing the String array.");
        //for(int i=0;i<stringArr.length;i++){
            //System.out.print(stringArr[i]+" ");
        //}


        SortCompetition team8= new Team1SortCompetition();
        int[] randIntArr= randomIntsArr(10000);
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
