package com.crossover.springboot.training.d01.s02.service;

import com.crossover.springboot.training.d01.s02.repository.ProductRepository;

import java.util.Optional;

/**
 * A simple product service, which uses a {@link ProductRepository} as a collaborator
 *
 * @author bogdan.solga
 */
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void displayProducts() {
        Optional.ofNullable(productRepository)
                .ifPresent(ProductRepository::displayProducts);
    }

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
