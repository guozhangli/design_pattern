package builder_pattern;

public class Classic implements Builder {

    private ServerProduct serverProduct = new ServerProduct();

    @Override
    public Builder installOs(String os) {
        serverProduct.setOs(os);
        return this;
    }

    @Override
    public Builder installLanguage(String language) {
        serverProduct.setLanguage(language);
        return this;
    }

    @Override
    public Builder installServer(String server) {
        serverProduct.setServer(server);
        return this;
    }

    @Override
    public Builder installDatabase(String database) {
        serverProduct.setDatabase(database);
        return this;
    }

    @Override
    public ServerProduct getServerProudct() {
        return serverProduct;
    }
}
