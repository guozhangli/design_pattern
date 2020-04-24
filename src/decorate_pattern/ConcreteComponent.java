package decorate_pattern;

public class ConcreteComponent extends Component {
    @Override
    protected void request() {
        System.out.println("concrete component");
    }
}
