public class Thingy implements Comparable<Thingy> {
    private int value;
    public Thingy(){
        this.value=(int)(Math.random()*10000);
    }

    public int compareTo(Thingy other){
        return this.value-other.value;
    }
}
