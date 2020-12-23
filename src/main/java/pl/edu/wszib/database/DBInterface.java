package pl.edu.wszib.database;

import pl.edu.wszib.model.Product;

import java.util.List;

public interface DBInterface {
    void placeProduct(String prod_name, int prod_quan);
    void takeProduct(String prod_name, int prod_quan);
    List<Product> getAllProducts();
}
