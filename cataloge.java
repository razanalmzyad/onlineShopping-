public class Catalog {
    private String catalogName;
    
    private Product products[];
    private int size;
public Catalog(){
    
}
    public Catalog(String catalogName) {
        this.catalogName = catalogName;
        products=new Product[100];
        size=0;
    }
    
    public void addProduct(){
        Product pro=new Product();
        pro.read();
        products[size++]=pro;
    }
    
    public void showProducts(){
        System.out.println("==============================================================");
        System.out.println("Catalog Name:"+this.catalogName);
        System.out.println("==============================================================");
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);  
        }
        System.out.println("--------------------------------------------------------------");
    }
    private boolean isRightProductId(int id){
        for (int i = 0; i < size; i++) {
            if (products[i].getProductId()==id) {
                return true;
            }    
        }
        return false;
    }
    private int getIndex(int id){
        for (int i = 0; i < size; i++) {
            if (products[i].getProductId()==id) {
                return i;
            }
        }
        return -1;
    }
    public Product getProduct(int id){
        if(isRightProductId(id))
            return products[getIndex(id)];
        else
            return null;
    }
    
    
}
