package pro.sky.cours2.project_2_11.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.cours2.project_2_11.service.product.Product;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {

    private final List<Product> productList;

    public Basket(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(List<Product> productList) {
        this.productList.addAll(productList);
    }

    public List<Product> getProduct() {
        return new ArrayList<>(productList);
    }
}
