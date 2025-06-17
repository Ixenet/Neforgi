package com.martynov.neforgi;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProductRepository {
    private final Map<Long, Product> products = new ConcurrentHashMap<>();
    private final AtomicLong idCounter = new AtomicLong();

    public ProductRepository() {
        save(new Product(null, "Nike Cortez", "Состав: 100% натуральная кожа. Закрытый нос. Отправка в течении 3-14 дней после заказа.", 90.00, "/images/1.jpg"));
save(new Product(null, "Штаны y2k", "Состав: 100% хлопок. Оверсайз крой / унисекс. Отправка в течении 3-14 дней после заказа.", 200.00, "/images/2.webp"));
save(new Product(null, "Цепочка Chrome Hearts", "Состав: золото 725 карат. Отправка в течении 3-14 дней после заказа.", 6000.00, "/images/3.webp"));
save(new Product(null, "Свитшот Marselin", "Состав: 80% хлопок, 20% лайкара. Оверсайз крой / унисекс. Отправка в течении 3-14 дней после заказа.", 60.00, "/images/4.png"));
save(new Product(null, "Цепочка Chrome Hearts", "Состав: серебро 800 карат. Отправка в течении 3-14 дней после заказа.", 1500.00, "/images/5.webp"));
save(new Product(null, "Свитшот Marselin", "Состав: 80% хлопок, 20% лайкара. Оверсайз крой / унисекс. Отправка в течении 3-14 дней после заказа.", 60.00, "/images/6.jpg"));
save(new Product(null, "Adidas Campus", "Состав: 60% натуральная кожа, 40% резина. Закрытый нос. Отправка в течении 3-14 дней после заказа.", 110.00, "/images/7.webp"));
save(new Product(null, "Balenciaga Track Sneaker", "Состав: 100% натуральная кожа. Закрытый нос. Отправка в течении 3-14 дней после заказа.", 1100.00, "/images/8.webp"));
    }

    public Collection<Product> findAll() {
        return products.values();
    }

    public Product save(Product product) {
        if (product.getId() == null) {
            product.setId(idCounter.incrementAndGet()); 
        }
        products.put(product.getId(), product);
        return product;
    }

    public Product findById(Long id) {
        return products.get(id);
    }

    public void deleteById(Long id) {
        products.remove(id);
    }
}