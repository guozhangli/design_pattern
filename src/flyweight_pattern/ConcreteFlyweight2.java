package flyweight_pattern;

public class ConcreteFlyweight2 extends Flyweight {
    public ConcreteFlyweight2(String _Extrinsic) {
        super(_Extrinsic);
    }

    @Override
    protected void operate() {
        System.out.println(super.Extrinsic);
    }
}
