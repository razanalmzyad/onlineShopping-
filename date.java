
import java.util.Scanner;


public class Date implements Readable,Comparable{
    
    private int day;
    private int month;
    private int year;

    public Date() {
        setDay(1);
        setMonth(1);
        setYear(1900);
    }

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day>=1 && day<=31)
            this.day = day;
        else
            try {
                throw new Exception("Bad day");
        } catch (Exception ex) {
            
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month>=1 && month<=12)
            this.month = month;
        else
            try {
                throw new Exception("Bad month");
        } catch (Exception ex) {
            
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>=1900)
            this.year = year;
        else
            try {
                throw new Exception("Year must be 1900 or more");
        } catch (Exception ex) {
            
        }
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
    
    public void read(){
        int d,m,y;
        Scanner input;
        
        //Enter the day
        while(true){   
            try{
                System.out.print("Enter day:");input=new Scanner(System.in);d=input.nextInt();
                setDay(d);
                break;
            }
            catch(Exception e){
                System.out.println(e.getMessage()+", try again");
            }
        }

        //Enter the month
        while(true){
            try{
                System.out.print("Enter month:");input=new Scanner(System.in);m=input.nextInt();
                setMonth(m);
                break;
            }
            catch(Exception e){
                System.out.println(e.getMessage()+", try again");
            }
        }
        
        //Enter the year
        while(true){
            try{
                System.out.print("Enter year:");input=new Scanner(System.in);y=input.nextInt();
                setYear(y);
                break;
            }
            catch(Exception e){
                System.out.println(e.getMessage()+", try again");
            }
        }
        
        
    }

    @Override
    public int compareTo(Object t) {
        if(year>((Date)t).year)
            return 1;
        else if(year<((Date)t).year)
            return -1;
        else if(month>((Date)t).month)
            return 1;
        else if(month<((Date)t).month)
            return -1;
        else if(day>((Date)t).day)
            return 1;
        else if(day<((Date)t).day)
            return -1;
        else
            return 0;
    }
    
    public void addDays(int ds){
        int r=day+ds;
        if (r>30) {
            day=r%30;
            r=r-day;
            r=r/30;
            r=r+month;
            if(r>12){
                month=r%12;
                r=r-month;
                year=year+r/12;
            }
            else{
                month=r;
            }
        }
        else
            day=r;
    }
}
