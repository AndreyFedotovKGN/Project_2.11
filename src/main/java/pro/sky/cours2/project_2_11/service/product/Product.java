package pro.sky.cours2.project_2_11.service.product;

public class Product {

    private final int productId;
    private final String nameProduct;
    private final double price;

    public int getProductId() {
        return productId;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public Product(int productId, String nameProduct, double price) {
        this.productId = productId;
        this.nameProduct = nameProduct;
        this.price = price;
    }
}
