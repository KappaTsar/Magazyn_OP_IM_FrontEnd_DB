package pl.edu.wszib.store.database;

import org.apache.commons.codec.digest.DigestUtils;
import pl.edu.wszib.store.model.Product;

import java.util.ArrayList;
import java.util.List;


public class SQLDatabase implements DBInterface{
    private List<Product> productList = new ArrayList<Product>();

    public void placeProduct(String prod_name, int prod_quan) {
        String prod_id = DigestUtils.md5Hex(prod_name);
        for(Product currentProd : this.productList) {
            if(currentProd.getId().equals(prod_id)) {
                currentProd.setQuan(currentProd.getQuan() + prod_quan);
                return;
            }
        }

        this.productList.add(new Product(prod_id, prod_name, prod_quan));
        System.out.println("Done!");
    }

    public void takeProduct(String prod_name, int prod_quan) {
        String prod_id = DigestUtils.md5Hex(prod_name);
        for(Product currentProd : this.productList) {
            if (currentProd.getId().equals(prod_id)) {
                int diff = currentProd.getQuan() - prod_quan;
                if (diff < 0) {
                    System.out.println("Nie mozesz wziac tego produktu wiecej niz " + currentProd.getQuan() + "\n");
                    return;
                }

                if (diff == 0) {
                    this.productList.remove(currentProd);
                } else {
                    currentProd.setQuan(diff);
                }
                System.out.println("Done!");
                return;
            }
        }
        System.out.println("Nie ma takiego produktu zobac na liscie! \n");
    }

    public List<Product> getAllProducts() {
        return this.productList ;
    }
}
