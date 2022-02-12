package model;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import persistence.ProductLoader;

/**
 *
 * @author RubisRage (Rubén Santana Lorenzo - ruben.santana120@alu.ulgpc.es)
 */
public class Catalogue{
    private static Catalogue INSTANCE;
    
    public static Catalogue instance(){
        if(INSTANCE==null){
            throw new IllegalStateException("Catalogue instance accessed"
                    + " before initialization.");
        }
        
        return INSTANCE;
    }
    
    public static void createInstance(ProductLoader pl){
        if(INSTANCE != null){
            throw new IllegalStateException("Catalogue::createIntance function "
                    + "called twice.");
        }
        
        INSTANCE = new Catalogue(pl.loadAllProducts());
    }
    
    private HashMap<String, Product> products = new HashMap<>();
    
    private Catalogue(List<Product> products){
        products.forEach(p -> this.products.put(p.getName(), p));
    }
    
    public Product getProduct(String name) {
        return products.get(name);
    }
    
    public Collection<Product> getAllProducts() {
        return Collections.unmodifiableCollection(products.values());
    }
    
}
