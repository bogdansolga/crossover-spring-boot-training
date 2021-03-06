package com.crossover.springboot.training.d01.s04.controller;

import com.crossover.springboot.training.d01.s04.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * A simple product {@link Controller}, which uses the {@link ProductService} as an {@link Autowired} collaborator
 *
 * @author bogdan.solga
 */
@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(final ProductService productService) {
        this.productService = productService;
    }

    public void displayProducts() {
        productService.displayProducts();
    }
}
