package ProjectBookStore;
import java.util.Scanner;
public class Horror
{
    static double price1, price2, price3, price4, price5;
    public static void Horror()
    {
        Horror a = new Horror();
        System.out.println("We have the following Horror Books: ");
        a.Dracula();
    }
    
    public void Dracula()
    {
        price1 = 115;
        System.out.println("First: ");
        System.out.println("Dracula");
        System.out.println("Length: 448 Pages");
        System.out.println("Language: Engish");
        System.out.println("Price: Rs.115");
        System.out.println("Kindle Edition Price: Rs. 0");
        System.out.println("Ratings: 4.2 out of 5");
        System.out.println("Author: Bram Stoker");
        System.out.println("Reference Number: 1");
        System.out.println("");
        System.out.println("");
        THOHH();
    }
    
    public void THOHH()
    {
        price2 = 499;
        System.out.println("Second: ");
        System.out.println("The Haunting of Hill House");
        System.out.println("Length: 256 Pages");
        System.out.println("Price: Rs.499");
        System.out.println("Ratings: 3.9 out of 5");
        System.out.println("Author: Shirley Jackson");
        System.out.println("Reference Number: 2");
        System.out.println("");
        System.out.println("");
        It();
    }
    
    public void It()
    {
        price3 = 350;
        System.out.println("Third: ");
        System.out.println("It");
        System.out.println("Length: 1184 Pages");
        System.out.println("Price: Rs.350");
        System.out.println("Ratings: 4.4 out of 5");
        System.out.println("Author: Stephen King");
        System.out.println("Reference Number: 3");
        System.out.println("");
        System.out.println("");
        TheExorcist();
    }
    
    public void TheExorcist()
    {
        price4 = 509;
        System.out.println("Fourth: ");
        System.out.println("The Exorcist");
        System.out.println("Length: 400 Pages");
        System.out.println("Price: Rs.509");
        System.out.println("Ratings: 4.8 out of 5");
        System.out.println("Author: William Peter Blatty");
        System.out.println("Reference Number: 4");
        System.out.println("");
        System.out.println("");
        TSOTL();
    }
    
    public void TSOTL()
    {
        price5 = 409;
        System.out.println("Fifth: ");
        System.out.println("The Silence of the Lambs");
        System.out.println("Length: 400 Pages");
        System.out.println("Price: Rs.409");
        System.out.println("Ratings: 4.4 out of 5");
        System.out.println("Author: Haniball Lector");
        System.out.println("Reference Number: 5");
        System.out.println("");
        System.out.println("");
        Input();
    }
    
    public void Input()
    {
        Billing h = new Billing();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice according to the above books' reference numbers: ");
        System.out.println("~~OR~~");
        System.out.println("Enter 0 if you want to go to the Main section again");
        int choice = sc.nextInt();
        if(choice>0&&choice<=5)
        {
            
        System.out.println("Enter the quantity: ");
        int q = sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                h.Horror((price1*q));
                break;
            }
            
            case 2:
            {
                h.Horror((price2*q));
                break;
            }
            
            case 3:
            {
                h.Horror((price3*q));
                break;
            }
            
            case 4:
            {
                h.Horror((price4*q));
                break;
            }
            
            case 5:
            {
                h.Horror((price5*q));
                break;
            }
        }
        
    }
    else if(choice==0)
    {
            
                MainMenu b = new MainMenu();
                b.main();
            
        }
        
    else
    {
        System.out.print("\f");
        System.out.println("Your choice was incorrect");
        System.out.println("Kindly view this section again and enter your choice again");
        Horror();
        
    }
    
} //end of Input
} //end of class
