public class Orders {
    
    private Order orders[];
    private int size;

    public Orders() {
        orders=new Order[100];
        size=0;
    }
    
    public void add(Order ord){
        orders[size]=ord;
        size++;
    }
    
    public void show(){
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("Orders:");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < size; i++) {
            System.out.println(orders[i]);
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    }
    
    
    
}
