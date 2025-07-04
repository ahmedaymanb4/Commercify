package commercify;

public class Cart {
    public boolean addProduct(String product, int quantity){
        if (quantity > product.quantity) {
            return false;
        } else {
            
            return true;
        }
    }
    public boolean checkout(){
        
        return ;
    }
}

