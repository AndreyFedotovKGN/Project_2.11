package pro.sky.cours2.project_2_11.service;

import org.springframework.stereotype.Service;
import pro.sky.cours2.project_2_11.component.Basket;
import pro.sky.cours2.project_2_11.service.product.Product;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StoreService {

    private final Basket basket;

    private Map<Integer, Product> productMap;

    public StoreService(Basket basket) {
        this.basket = basket;
    }
    @PostConstruct
    public void init() {
        productMap = Map.of(1, new Product(1, "ручка", 75),
                            2, new Product(2, "карандаш", 25),
                            3, new Product(3, "линейка", 38)
                            );
    }

    public void addProduct(List<Integer> productId) {
        basket.addProduct(productId.stream().map(id->productMap.get(id)).collect(Collectors.toList()));
        }

    public List<Product> getProduct() {
        return basket.getProduct();
    }
}
