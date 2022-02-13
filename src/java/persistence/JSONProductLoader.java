package persistence;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonValue;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import model.Product;

/**
 *
 * @author RubisRage (Rubén Santana Lorenzo - ruben.santana120@alu.ulgpc.es)
 */
public class JSONProductLoader implements ProductLoader {

    private final String productsFile = "books.json";

    @Override
    public List<Product> loadAllProducts() {
        
        InputStream is = getClass().getResourceAsStream(productsFile);
        
        if(is == null){
            throw new RuntimeException(productsFile + " could not be found.");
        }
        
        JsonArray productsJson = Json.createReader(is).readArray();
        ArrayList<Product> productsList = new ArrayList<>();
        
        for(JsonValue product : productsJson){
            JsonObject p = product.asJsonObject();
            
            String name         = p.getString("title");
            String imageLink    = p.getString("imageLink");
            String link         = p.getString("link");
            Double price        = p.getJsonNumber("price").doubleValue();
            
            
            ArrayList<String> attributes = new ArrayList<>();
            for(var entry : p.entrySet()){

                if(!List.of("title", "price", "imageLink", "link").contains(entry.getKey())){
                    attributes.add(entry.getKey() + ": " + entry.getValue().toString());
                }
                
            }
            
            productsList.add(new Product(name, imageLink, link, price, 
                    Collections.unmodifiableList(attributes)));
        }        
                
        return productsList;
    }
}
