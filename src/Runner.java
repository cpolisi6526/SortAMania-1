public class Runner {
    public static void main(String[] args){
        SortCompetition team8= new Team1SortCompetition();
        int[] randIntArr= randomIntsArr(10000);
        String[] randStringArr= ranStringArr(10000,5);

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
