package ProjectBookStore;
import java.util.Scanner;
public class Billing
{
    public static void Academic(double aprice)
    {
        double gst = 0.0*aprice;
        double amount = 1.18*aprice;
        int ramount= (int)amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 if you want to start the billing process: ");
        System.out.println("Enter 2 if you want to Exit the store: ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("Your price from the Academic section: Rs."+aprice);
                System.out.println("GST Price: "+gst);
                System.out.println("Total Amount: "+amount);
                System.out.println("Rounded off Total Amount: "+ramount);
                System.out.println("Thank you for shopping at 'The Author Attic' Book Store!");
                break;
            }
            
            case 2:
            {
                System.out.print("\f");
                System.out.println("Thank you for Shopping in our Book Store!");
                System.exit(0);
                break;
            }
        }
    }
    public static void AutoB(double abprice)
    {
        double gst = 0.18*abprice;
        double amount = 1.18*abprice;
        int ramount= (int)amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 if you want to start the billing process: ");
        System.out.println("Enter 2 if you want to Exit the store: ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("Your price from the Biographies and Auto-biographies section: Rs."+abprice);
                System.out.println("GST Price: "+gst);
                System.out.println("Total Amount: "+amount);
                System.out.println("Rounded off Total Amount: "+ramount);
                System.out.println("Thank you for shopping at 'The Author Attic' Book Store!");
                break;
            }
            
            case 2:
            {
                System.out.print("\f");
                System.out.println("Thank you for Shopping in our Book Store!");
                System.exit(0);
                break;
            }
        }
    }
    public static void S_F(double sfprice)
    {
        double gst = 0.18*sfprice;
        double amount = 1.18*sfprice;
        int ramount= (int)amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 if you want o start the billing process: ");
        System.out.println("Enter 2 if you want to Exit the store: ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("Your price from the Science-fiction section: Rs."+sfprice);
                System.out.println("GST Price: "+gst);
                System.out.println("Total Amount: "+amount);
                System.out.println("Rounded off Total Amount: "+ramount);
                System.out.println("Thank you for shopping at 'The Author Attic' Book Store!");
                break;
                
            }
            
            case 2:
            {
                System.out.print("\f");
                System.out.println("Thank you for Shopping in our Book Store!");
                System.exit(0);
                break;
            }
        }
    }
    public static void Horror(double hprice)
    {
        double gst = 0.18*hprice;
        double amount = 1.18*hprice;
        int ramount= (int)amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 if you want o start the billing process: ");
        System.out.println("Enter 2 if you want to Exit the store: ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("Your price from the Horror section: Rs."+hprice);
                System.out.println("GST Price: "+gst);
                System.out.println("Total Amount: "+amount);
                System.out.println("Rounded off Total Amount: "+ramount);
                System.out.println("Thank you for shopping at 'The Author Attic' Book Store!");
                break;
            }
            
            case 2:
            {
                System.out.print("\f");
                System.out.println("Thank you for Shopping in our Book Store!");
                System.exit(0);
                break;
            }
        }
    }
    public static void Spiritual(double sprice)
    {
        double gst = 0.12*sprice;
        double amount = 1.18*sprice;
        int ramount= (int)amount;        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 if you want o start the billing process: ");
        System.out.println("Enter 2 if you want to Exit the store: ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("Your price from the Spiritual section: Rs."+sprice);
                System.out.println("GST Price: "+gst);
                System.out.println("Total Amount: "+amount);
                System.out.println("Rounded off Total Amount: "+ramount);
                System.out.println("Thank you for shopping at 'The Author Attic' Book Store!");
                break;
            }
            
            case 2:
            {
                System.out.print("\f");
                System.out.println("Thank you for Shopping in our Book Store!");
                System.exit(0);
                break;
            }
        }
    }
    public static void A_A(double aaprice)
    {
        double gst = 0.12*aaprice;
        double amount = 1.18*aaprice;
        int ramount= (int)amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 if you want o start the billing process: ");
        System.out.println("Enter 2 if you want to Exit the store: ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("Your price from the Action and Adventure section: Rs."+aaprice);
                System.out.println("GST Price: "+gst);
                System.out.println("Total Amount: "+amount);
                System.out.println("Rounded off Total Amount: "+ramount);
                System.out.println("Thank you for shopping at 'The Author Attic' Book Store!");
                break;
            }
            
            case 2:
            {
                System.out.print("\f");
                System.out.println("Thank you for Shopping in our Book Store!");
                System.exit(0);
                break;
            }
        }
    } //end of A_A
} //end of class
