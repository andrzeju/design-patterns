package pl.urbanlab.patterns.behavioral.strategy;

/**
 * Created by andrzej on 25.06.17.
 */
public class StrategyClient {
    public static void main(String[] args) {
        ShopClient regularClient = new ShopClient(new RegularDiscount());
        ShopClient vipClient = new ShopClient(new VipDiscount());

        System.out.println(regularClient.showDiscount());
        System.out.println(vipClient.showDiscount());
    }



}
