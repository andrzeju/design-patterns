package pl.urbanlab.patterns.structural.proxy;

/**
 * Created by andrzej on 19.06.17.
 */
public class ProxyClient {

    public static void main(String[] args) {
        ServerState serverProxy = new ServerStateProxy(new Server());
        System.out.println(serverProxy.getStatus());
    }

}
