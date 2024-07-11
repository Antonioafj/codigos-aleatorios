public class GeoometricProgression extends Progression{
    protected long base;

    public GeoometricProgression(){
        this(2,1);
    }

    public GeoometricProgression(long b){
        this(b, 1);
    }

    public GeoometricProgression(long b, long start) {
        super(start);
        base = b;
    }

    protected void advance(){
        current *= base;
    }
    
}
