package persistence;

import java.util.List;
import model.Product;

/**
 *
 * @author RubisRage (Rubén Santana Lorenzo - ruben.santana120@alu.ulgpc.es)
 */
public interface ProductLoader {
    List<Product> loadAllProducts();
}
