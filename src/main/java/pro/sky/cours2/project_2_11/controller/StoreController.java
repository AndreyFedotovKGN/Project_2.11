package pro.sky.cours2.project_2_11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.cours2.project_2_11.service.product.Product;
import pro.sky.cours2.project_2_11.service.StoreService;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")

    public void addProduct(
            @RequestParam(value = "id") List<Integer> productId) {
        storeService.addProduct(productId);

    }

    @GetMapping("/get")
    public List<Product> getProduct() {
        return storeService.getProduct();
    }

}
