package pl.edu.wszib.store.database;

import pl.edu.wszib.store.model.Product;

import java.util.List;

public interface DBInterface {
    void placeProduct(String prod_name, int prod_quan);
    void takeProduct(String prod_name, int prod_quan);
    List<Product> getAllProducts();
}
