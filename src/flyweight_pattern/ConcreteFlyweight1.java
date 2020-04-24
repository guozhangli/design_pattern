package flyweight_pattern;

public class ConcreteFlyweight1 extends Flyweight {

    public ConcreteFlyweight1(String _Extrinsic) {
        super(_Extrinsic);
    }

    @Override
    protected void operate() {
        System.out.println(super.Extrinsic);
    }
}
