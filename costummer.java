public class Customer extends User{
    private ShoppingCart cart;
    private  Orders orders;
    private Address address;
    private CreditCard creditCard;
 public Customer(){
     
 }
    public Customer(String name, String password, Catalog catalog) {
        super(name, password, catalog);
        this.cart =new ShoppingCart();
        this.orders = new Orders();
        this.address = new Address();
        this.creditCard = new CreditCard();
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
    

    public void readProfile(){
        this.address.read();
        this.creditCard.read();
    }

    @Override
    public String toString() {
        return "Customer{" + "Address:" + address + ", CreditCard:" + creditCard + '}';
    }
    
}
