package luiznux.learning.microservices.product;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * Create a new product
     *
     * @param product the product to be created
     */
    public void createProduct(Product product){
        productRepository.save(product);
    }


}
