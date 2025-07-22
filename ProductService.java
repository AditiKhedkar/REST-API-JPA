package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getAll() {
        return repo.findAll();
    }

    public Optional<Product> getById(Long id) {
        return repo.findById(id);
    }

    public Product create(Product product) {
        return repo.save(product);
    }

    public Product update(Long id, Product product) {
        product.setId(id);
        return repo.save(product);
    }

    public Product patch(Long id, Product updates) {
        return repo.findById(id).map(existing -> {
            if (updates.getName() != null) existing.setName(updates.getName());
            if (updates.getPrice() != null) existing.setPrice(updates.getPrice());
            if (updates.getCategory() != null) existing.setCategory(updates.getCategory());
            return repo.save(existing);
        }).orElseThrow();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}