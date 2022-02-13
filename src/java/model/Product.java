package model;

import java.util.List;

/**
 *
 * @author RubisRage (Rubén Santana Lorenzo - ruben.santana120@alu.ulgpc.es)
 */
public class Product {
    private final String name;
    private final String imageLink;
    private final String link;
    private final Double price;
    private final List<String> attributes;

    public Product(String name, String imageLink, String link, Double price, 
            List<String> attributes) {
        
        this.name = name;
        this.imageLink = imageLink;
        this.link = link;
        this.price = price;
        this.attributes = attributes;
    }

    public String getLink() {
        return link;
    }

    public String getName() {
        return name;
    }

    public String getImageLink() {
        return imageLink;
    }

    public Double getPrice() {
        return price;
    }

    public List<String> getAttributes() {
        return attributes;
    }
}
