package pl.urbanlab.patterns.structural.proxy;

/**
 * Created by andrzej on 19.06.17.
 */
public class ServerStateProxy implements ServerState {

    private final Server server;

    public ServerStateProxy(Server server) {
        this.server = server;
    }

    @Override
    public String getStatus() {
        return server.getStatus();
    }
}
