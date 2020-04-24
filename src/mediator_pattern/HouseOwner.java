package mediator_pattern;

public class HouseOwner extends Person {

    HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contract(String message) {
        mediator.constract(message, this);
    }

    public void getMessage(String message) {
        System.out.println("house owner get message:".concat(message));
    }

}
