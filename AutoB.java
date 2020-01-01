package ProjectBookStore;
import java.util.Scanner;
public class AutoB
{
    static double price1, price2, price3, price4, price5;
    public static void AutoB()
    {
        AutoB a = new AutoB();
        System.out.println("We have the following Biographies and Auto-biographies: ");
        a.First();
    }
    
    public void First()
    {
        price1 = 185;
        System.out.println("First: ");
        System.out.println("My Journey: Transforming Dreams Into Actions");
        System.out.println("Length: 160 Pages");
        System.out.println("Language: Engish");
        System.out.println("Price: Rs.185");
        System.out.println("Ratings: 4.7 out of 5");
        System.out.println("Reference Number: 1");
        System.out.println("");
        System.out.println("");
        Second();
    }
    
    public void Second()
    {
        price2 = 125;
        System.out.println("Second: ");
        System.out.println("Autobiography Of A Yogi");
        System.out.println("Length: 510 Pages");
        System.out.println("Price: Rs.125");
        System.out.println("Ratings: 4.6 out of 5");
        System.out.println("Reference Number: 2");
        System.out.println("");
        System.out.println("");
        Third();
    }
        
    public void Third()
    {
        price3 = 114;
        System.out.println("Third: ");
        System.out.println("Chanakya Neeti");
        System.out.println("Length: 152 Pages");
        System.out.println("Price: Rs.114");
        System.out.println("Ratings: 4.1 out of 5");
        System.out.println("Reference Number: 3");
        System.out.println("");
        System.out.println("");
        Fourth();
    }
    
    public void Fourth()
    {
        price4 = 919;
        System.out.println("Fourth: ");
        System.out.println("Leonardo da Vinci: A Life From Beginning to End");
        System.out.println("Length: 43 Pages");
        System.out.println("Price: Rs.919");
        System.out.println("Ratings: 4.3 out of 5");
        System.out.println("Reference Number: 4");
        System.out.println("");
        System.out.println("");
        Fifth();
    }
    
    public void Fifth()
    {
        price5 = 66;
        System.out.println("Fifth: ");
        System.out.println("Alexander the Great: The Macedonian Who Conquered the World");
        System.out.println("Length: 57 Pages");
        System.out.println("Price: Rs.66");
        System.out.println("Ratings: 4.2 out of 5");
        System.out.println("Reference Number: 5");
        System.out.println("");
        System.out.println("");
        Input();
    }
    
    public void Input()
    {
        Billing z = new Billing();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice according to the above books' reference numbers: ");
        System.out.println("~~OR~~");
        System.out.println("Enter 0 if wish to go back to the Main Menu");
        int choice = sc.nextInt();
        int q;
        switch(choice)
        {
            
            case 1:
            {
                System.out.println("Enter the quantity: ");
                q = sc.nextInt();
                z.AutoB((price1*q));
                break;
            }
            
            case 2:
            {
                System.out.println("Enter the quantity: ");
                q = sc.nextInt();
                z.AutoB((price2*q));
                break;
            }
            
            case 3:
            {
                System.out.println("Enter the quantity: ");
                q = sc.nextInt();
                z.AutoB((price3*q));
                break;
            }
            
            case 4:
            {
                System.out.println("Enter the quantity: ");
                q = sc.nextInt();
                z.AutoB((price4*q));
                break;
            }
            
            case 5:
            {
                System.out.println("Enter the quantity: ");
                q = sc.nextInt();
                z.AutoB((price5*q));
                break;
            }
            
            case 0:
            {
            
                MainMenu b = new MainMenu();
                b.main();
                break;
            }
        
            default:
    {
        System.out.print("\f");
        System.out.println("Your choice was incorrect");
        System.out.println("Kindly view this section again and enter your choice again");
        AutoB();
        break;
    }
            
}

} //end of Input
} //end of class