
import java.util.Scanner;

public class Product implements Readable{
    private static int NEXT=0;
    private int productId;
    private String productName;
    private double price;

    
    public Product() {
        this.productId = ++NEXT;
    }

    
    public Product(String productName, double price) {
        this.productId = ++NEXT;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "productId:" + productId + ", productName:" + productName + ", price:" + price + '}';
    }
    
    public void read(){
        Scanner input;
        input=new Scanner(System.in);
        
        System.out.print("Enter product name:");
        this.productName=input.nextLine();
        
        System.out.print("Enter product price:");
        this.price=input.nextDouble();
        
    }
    
    
    
}
