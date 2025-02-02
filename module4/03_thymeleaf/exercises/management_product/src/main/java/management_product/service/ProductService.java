package management_product.service;

import management_product.model.bean.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService implements iProductService {

    private static final Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone3", 12,"đep", "Apple"));
        products.put(2, new Product(2, "Galaxy",23, "bền", "Samsung"));
        products.put(3, new Product(3, "Note9",14, "rẻ", "Xiaomi"));
        products.put(4, new Product(4, "A12",15, "xanh", "Huewei"));
        products.put(5, new Product(5, "Note7",16, "đỏ", "Samsung"));
        products.put(6, new Product(6, "Iphonex",17, "tím", "Apple"));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> list=new ArrayList<>(products.values());
        List<Product> productList=new ArrayList<>();
                for (int i=0;i<list.size();i++){
                    if (list.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                        productList.add(list.get(i));
                    }
                }
        return productList;
    }
}
