package builder_pattern;

public class Director {
    private Builder builder = new Classic();

    public ServerProduct createClassicCentos() {
        builder.installOs("centos").installLanguage("java").installServer("tomcat").installDatabase("mysql");
        return builder.getServerProudct();
    }

    public ServerProduct createClassicUbuntu() {
        builder.installOs("ubuntu").installLanguage("java").installServer("tomcat").installDatabase("mysql");
        return builder.getServerProudct();
    }
}
