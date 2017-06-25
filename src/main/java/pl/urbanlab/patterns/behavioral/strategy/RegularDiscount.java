package pl.urbanlab.patterns.behavioral.strategy;

/**
 * Created by andrzej on 25.06.17.
 */
public class RegularDiscount implements DiscountStrategy {
    @Override
    public int getDiscountPercent() {
        return 5;
    }
}
