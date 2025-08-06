public class Main {
    public static void main(String[] args) {
        // สร้างสินค้า
        Product p1 = new Product(1, "Laptop", 30000);
        Product p2 = new Product(2, "Mouse", 500);

        // สร้างคลังสินค้า
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(p1);
        catalog.addProduct(p2);

        // สร้าง CartItem
        CartItem cartItem = new CartItem(p1, 2);

        // สร้างกลยุทธ์ส่วนลด
        DiscountStrategy discountStrategy = new PercentageDiscount(10); // ลด 10%
        PricingService pricingService = new PricingService(discountStrategy);

        // คำนวณราคาสุทธิ
        double finalPrice = pricingService.calculatePrice(cartItem.getProduct(), cartItem.getQuantity());

        System.out.println("สินค้า: " + cartItem.getProduct().getName());
        System.out.println("จำนวน: " + cartItem.getQuantity());
        System.out.println("ราคาก่อนส่วนลด: " + cartItem.getProduct().getPrice() * cartItem.getQuantity() + " บาท");
        System.out.println("ราคาหลังส่วนลด: " + finalPrice + " บาท");
    }
}