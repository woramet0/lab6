public class NoDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(Product product, int quantity) {
        return 0.0;
    }
}