public class Thingy implements Comparable<Thingy> {
    private int value;
    public Thingy(){

        this.value=(int)(Math.random()*10000);
    }

    public int compareTo(Thingy other){
        if(this.value==other.value){
            return 0;
        }
        else if(this.value>other.value){
            return 1;
        }
        return -1;
    }
}
