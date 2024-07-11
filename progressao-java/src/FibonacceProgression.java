public class FibonacceProgression extends Progression{
    protected long prev;
    
    public FibonacceProgression(){
        this(0, 1);
    }

    public FibonacceProgression (long first, long second) {
        super(first);
        prev = second - first;
    }

    protected void advance() {
        long temp = prev + current;
        prev = current;
        current = temp;
    }
}
