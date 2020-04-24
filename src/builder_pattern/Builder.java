package builder_pattern;

public interface Builder {

    Builder installOs(String os);

    Builder installLanguage(String language);

    Builder installServer(String server);

    Builder installDatabase(String database);

    ServerProduct getServerProudct();
}
