package decorate_pattern;

public abstract class Decorater extends Component {

    private Component component;

    public Decorater(Component component) {
        this.component = component;
    }

    @Override
    protected void request() {
        component.request();
    }
}
