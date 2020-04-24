package builder_pattern;

public class TestBuilder {
    public static void main(String[] args) {
        Director director = new Director();
        ServerProduct serverProduct = director.createClassicCentos();
        System.out.println(serverProduct.toString());
        director = new Director();
        ServerProduct serverProduct1 = director.createClassicUbuntu();
        System.out.println(serverProduct1.toString());

        System.out.println(serverProduct.toString());
    }
}
