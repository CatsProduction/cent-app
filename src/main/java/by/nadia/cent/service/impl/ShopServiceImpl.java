package by.nadia.cent.service.impl;

import by.nadia.cent.entity.Product;
import by.nadia.cent.entity.Shop;
import by.nadia.cent.repository.ProductRepository;
import by.nadia.cent.repository.ShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ShopServiceImpl {

    private final ShopRepository shopRepository;
    private final ProductRepository productRepository;

    public Map<Double, Shop> getAllShopsSortedByAmountForProducts(List<Product> products) {//dto

        List<Shop> shops = shopRepository.findAll();

        Map<Double, Shop> bla = new TreeMap<>();//

        for (Shop shop : shops) {

            Double amount = calculateAmount(shop, products);
            bla.put(amount, shop);
        }

        //TreeMap

        //stream: высчитать затрачиваемую сумму и отсортировать по ней

        return null;
    }

    private Double calculateAmount(Shop shop, List<Product> products) {

        Double amount = defineExistingProducts(shop, products).stream()
                .mapToDouble(Product::getPrice)
                .sum();

        return amount;
    }

    private List<Product> defineExistingProducts(Shop shop, List<Product> customerProducts) {

        List<Product> existingProducts;

        List<Product> shopProducts = new ArrayList<>();

        existingProducts = shopProducts.stream()
                .filter(customerProduct -> customerProducts.stream()
                        .anyMatch(shopProduct -> shopProduct.getBrand().equals(customerProduct.getBrand()) &&
                                shopProduct.getType().equals(customerProduct.getType()) ))
                .collect(Collectors.toList());

        return existingProducts;
    }

}
