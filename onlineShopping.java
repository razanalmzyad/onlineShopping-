
import java.util.Scanner;

public class OnlineShoppingSystem {

    public static void main(String[] args) {
        Catalog catalog=new Catalog("clothese");
        Users users=new Users(catalog);
        users.add(new Administrator("Admin","123456",catalog));
        while(true){
            System.out.println("1-Login");
            System.out.println("2-Register Admin user");
            System.out.println("3-Register Customer user");
            System.out.println("4-Exit");
            int c;
            Scanner input=new Scanner(System.in);
            System.out.print("your choise?:");
            c=input.nextInt();
            if (c==1) {
                users.login();
            } else if (c==2) {
                Administrator admin=new Administrator("", "", catalog);
                admin.read();
                users.add(admin);
                System.out.println("New Administrator user is registerd.");
            } else if (c==3) {
                Customer cust=new Customer("", "", catalog);
                cust.read();
                users.add(cust);
                System.out.println("New Customer user is registerd.");
                
            }else{
                break;
            }
            
            
        }
        
        

    }
    
}
