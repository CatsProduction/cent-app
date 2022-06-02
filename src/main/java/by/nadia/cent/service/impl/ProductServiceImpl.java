package by.nadia.cent.service.impl;

import by.nadia.cent.entity.Product;
import by.nadia.cent.repository.ProductRepository;
import by.nadia.cent.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public void saveAll(List<Product> products) {
        productRepository.saveAll(products);
    }
}
