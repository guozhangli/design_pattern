package flyweight_pattern;

public abstract class Flyweight {

    private String intrinsic;

    protected final String Extrinsic;

    public Flyweight(String _Extrinsic) {
        this.Extrinsic = _Extrinsic;
    }

    protected abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
