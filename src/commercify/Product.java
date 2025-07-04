package commercify;

import java.util.Date;

/**
 *
 * @author Bebooo
 */
public class Product {
    private String name;
    private float price;
    private int quantity;
    private Date expirationDate;
    private float weight;

    public Product(String name, float price, int quantity, Date expirationDate) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    public Product(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return this.name;
    }
    public float getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public Date getExpirationDate(){
        return this.expirationDate;
    }
    public float getWeight(){
        return this.weight;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setExpirationDate(Date expirationDate){
        this.expirationDate = expirationDate;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }
}