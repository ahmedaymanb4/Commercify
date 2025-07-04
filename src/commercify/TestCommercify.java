package commercify;

import java.util.Date;

/**
 *
 * @author Bebooo
 */
public class TestCommercify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product product1 = new Product("Product 1", 19.99f, 20, new Date(2025, 8, 1));
        Product product2 = new Product("Product 2", 50f, 30);
        System.out.println(product2.getExpirationDate());
    }
    
}
