package mediator_pattern;

public class Tenant extends Person {
    Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contract(String message) {
        mediator.constract(message, this);
    }

    public void getMessage(String message) {
        System.out.println("tenant get message is:".concat(message));
    }
}
