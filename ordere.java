
import java.util.Scanner;

public class Order {
    private static int NEXT=0;
    private static int NEXT_SHIP=10;
    
    private int orderId;
    private int shippingId;
    private String shippingType;
    private double shippingCost;
    private Date shippingDate;
    private String status;
    private ShoppingCart cart;

     public Order(){
         
     }
    public Order(Date shippingDate,ShoppingCart cart) {
        this.orderId = ++NEXT;
        this.shippingId = ++NEXT_SHIP;
        this.shippingDate = shippingDate;
        System.out.println("Select the way of shipping:");
        System.out.println("1-Normal");
        System.out.println("2-Urgent");
        System.out.print("Your choise:");
        int c;
        Scanner input=new Scanner(System.in);
        c=input.nextInt();
        if(c==1){
            this.shippingType="Normal";
            this.shippingCost = 200;
            this.shippingDate.addDays(15);
        }
        else{
           this.shippingType = "Urgent";
           this.shippingCost = 100;
           this.shippingDate.addDays(7);
        }
         
        this.status = "Completed";
        this.cart=cart;
    }

    @Override
    public String toString() {
        return "Order{" 
                + "Order Id:" + orderId 
                + ", ShippingId:" + shippingId 
                + ", Shipping Type:" + shippingType 
                + ", Shipping Cost:" + shippingCost 
                + ", Shipping Date:" + shippingDate 
                + ", Status:" + status
                + ", Cart total:"+ cart.getTotal()
                + ", Order Total:"+(cart.getTotal()+shippingCost)
                + '}';
    }
    
    
    
}
