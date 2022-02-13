package model;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author RubisRage (Rubén Santana Lorenzo - ruben.santana120@alu.ulgpc.es)
 */
public class ShoppingCart {
    private final ArrayList<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);    
    }

    public boolean addProduct(Product p){
        return products.add(p);
    }
    
    public boolean removeProduct(Product p){
        return products.remove(p);
    }
    
    public Integer size() {
        return products.size();
    }
}
