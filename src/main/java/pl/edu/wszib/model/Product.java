package pl.edu.wszib.model;

public class Product {
    private String id;
    private String name;
    private int quan;

    public Product(String id, String name, int quan) {
        this.id = id;
        this.name = name;
        this.quan = quan;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getQuan(){
        return this.quan;
    }

    public void setQuan(int n_quan){
        this.quan = n_quan;
    }

    @Override
    public String toString() {
        return "Product o nazwie {" + name + "} w ilosci " + quan;
    }
}
