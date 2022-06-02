package by.nadia.cent.controller;

import by.nadia.cent.entity.Product;
import by.nadia.cent.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product/")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    private void saveProducts(@RequestBody List<Product> products){

        productService.saveAll(products);
    }
}
