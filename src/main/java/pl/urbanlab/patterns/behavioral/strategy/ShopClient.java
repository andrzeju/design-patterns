package pl.urbanlab.patterns.behavioral.strategy;

/**
 * Created by andrzej on 25.06.17.
 */
public class ShopClient {
    private final DiscountStrategy discoutStrategy;

    public ShopClient(DiscountStrategy discount) {
        this.discoutStrategy = discount;
    }

    public String showDiscount() {
        return "My discount is " + discoutStrategy.getDiscountPercent() + "%";
    }
}
