
import java.util.Scanner;

public class Users {
    private Catalog catalog;
    private User users[];
    private int size;

     public Users(){
         
     }
    public Users(Catalog catalog) {
        this.catalog = catalog;
        this.users = new User[100];
        this.size = 0;
    }
    
    public void add(User user){
        users[size]=user;
        size++;
    }
    
    private int isFound(String userNmae,String password){
        User u=new Administrator(userNmae, password, catalog);
        for (int i = 0; i < size; i++) {
            if(users[i].compareTo(u)==0)
                return i;
        }
        return -1;
    }
    
    public void login(){
        Scanner input;
        String userName;
        String password;
        
        System.out.print("Enter User Name:");
        input=new Scanner(System.in);
        userName=input.next();
        
        System.out.print("Enter Password:");
        input=new Scanner(System.in);
        password=input.next();
        
        int r=isFound(userName, password);
        
        if (r>=0) {
            if (users[r] instanceof Administrator) {
                Administrator adminU=(Administrator)users[r];
                while(true){
                    System.out.println("1-Add product");
                    System.out.println("2-Display All products");
                    System.out.println("3-Exit");
                    input=new Scanner(System.in);
                    System.out.print("your choise?:");
                    int c=input.nextInt();
                    if (c==1) {
                        adminU.getCatalog().addProduct();
                    } else if (c==2) {
                        adminU.getCatalog().showProducts();
                    }else{
                        break;
                    }
                    
                }
                
            }
            else{
                Customer custU=(Customer)users[r];
                while(true){
                    System.out.println("1-Display All products");
                    System.out.println("2-Add product to Shopping Cart");
                    System.out.println("3-Remove product from Shopping Cart");
                    System.out.println("4-Show cart");
                    System.out.println("5-checkout");
                    System.out.println("6-Display All Orders");
                    System.out.println("7-Update your profile");
                    System.out.println("8-Show your profile");
                    System.out.println("9-Exit");
                    
                    input=new Scanner(System.in);
                    System.out.print("your choise?:");
                    int c=input.nextInt();
                    if (c==1) {
                        custU.getCatalog().showProducts();
                    } 
                    else if (c==2) {
                        Product pro;
                        input=new Scanner(System.in);
                        int id,qty;
                        Date d=new Date();
                        System.out.print("Enter product id:");
                        id=input.nextInt();
                        System.out.print("Enter Quantity:");
                        qty=input.nextInt();
                        System.out.print("Enter the Date:");
                        d.read();
                        pro=custU.getCatalog().getProduct(id);
                        if(pro==null)
                            System.out.println("Error id");
                        else
                            custU.getCart().add(pro, qty, d);
                    }
                    else if (c==3) {
                        input=new Scanner(System.in);
                        int id;
                        System.out.print("Enter product id:");
                        id=input.nextInt();
                        custU.getCart().remove(id);
                    }
                    else if (c==4) {
                        custU.getCart().showCart();
                    }
                    else if (c==5) {
                        Order ord=custU.getCart().checkout();
                        custU.getOrders().add(ord);
                        System.out.println(ord+" is created.");
                    }
                    else if (c==6) {
                        custU.getOrders().show();
                    }
                    else if (c==7) {
                        custU.readProfile();
                    }
                    else if (c==8) {
                        System.out.println(custU);;
                    }
                    else{
                        break;
                    }
                    
                }
                
            }
        }
        else{
            System.out.println("The user is not registerd.");
        }
        
        
        
    }
    

    
}
