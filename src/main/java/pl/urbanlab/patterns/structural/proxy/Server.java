package pl.urbanlab.patterns.structural.proxy;

/**
 * Created by andrzej on 19.06.17.
 */
public class Server {

    public String getStatus() {
        return "OK";
    }

    public void reboot() {
        System.out.println("System is going for reboot NOW!!!");
    }
}
