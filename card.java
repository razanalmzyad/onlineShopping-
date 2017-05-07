
import java.util.Scanner;

public class CreditCard {
    private String cardNumber;
    private Date expireDate;
    private String cardType;

    public CreditCard() {
    }

    public CreditCard(String cardNumber, String cardType) {
        this.cardNumber = cardNumber;
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "\nCreditCard{" + "cardNumber=" + cardNumber + ", expireDate=" + expireDate + ", cardType=" + cardType + '}';
    }
    
    public void read(){
        Scanner input;
        input=new Scanner(System.in);
        System.out.println("Enter Card Number:");
        this.cardNumber=input.nextLine();
        
        input=new Scanner(System.in);
        System.out.println("Enter Card Type:");
        this.cardType=input.nextLine();
        
        System.out.println("Enter Expire Date:");
        this.expireDate=new Date();
        this.expireDate.read();
        
        
    }
    
}
