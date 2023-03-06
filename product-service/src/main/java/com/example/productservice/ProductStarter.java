package com.example.productservice;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component("userStarter")
@RequiredArgsConstructor
class ProductStarter implements ApplicationListener<ContextRefreshedEvent> {

    private final ProductRepository productRepository;

    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {
        productRepository.save(new Product(null, "Iphone 5", "This is description of IPhone 5.", BigDecimal.valueOf(4599.99)));
        productRepository.save(new Product(null, "Iphone 6", "This is description of IPhone 6.", BigDecimal.valueOf(7299.99)));
        productRepository.save(new Product(null, "Samsung s20", "This is description of Samsung s20.", BigDecimal.valueOf(2999.99)));
        productRepository.save(new Product(null, "Samsung j70", "This is description of Samsung j70.", BigDecimal.valueOf(699.99)));
        productRepository.save(new Product(null, "Iphone 6 pro", "This is description of IPhone 6 pro.", BigDecimal.valueOf(9899.99)));
    }

}
