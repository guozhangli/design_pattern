package builder_pattern;

public class ServerProduct {

    private String os;
    private String language;
    private String server;
    private String database;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    @Override
    public String toString() {
        return "ServerProduct{" +
                "os='" + os + '\'' +
                ", language='" + language + '\'' +
                ", server='" + server + '\'' +
                ", database='" + database + '\'' +
                '}';
    }
}
