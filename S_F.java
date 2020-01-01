package ProjectBookStore;
import java.util.Scanner;
public class S_F
{
    static double price1, price2, price3, price4, price5;
    public static void S_F()
    {
        S_F a = new S_F();
        System.out.println("We have the following Science-fiction books: ");
        a.Frankenstein();
    }
    
    public void Frankenstein()
    {
        price1=86;
        System.out.println("First: ");
        System.out.println("Frankenstein");
        System.out.println("Length: 280 Pages");
        System.out.println("Language: Engish");
        System.out.println("Price: Rs.86");
        System.out.println("Ratings: 4.2 out of 5");
        System.out.println("Author: Mary Shelley");
        System.out.println("Reference Number: 1");
        System.out.println("");
        System.out.println("");
        IRobot();
    }
    
    public void IRobot()
    {
        price2=286;
        System.out.println("Second: ");
        System.out.println("I, Robot");
        System.out.println("Length: 256 Pages");
        System.out.println("Price: Rs.286");
        System.out.println("Ratings: 4 out of 5");
        System.out.println("Isaac Asimov");
        System.out.println("Reference Number: 2");
        System.out.println("");
        System.out.println("");
        Martian();
    }
    
    public void Martian()
    {
        price3=270;
        System.out.println("Third: ");
        System.out.println("The Martian");
        System.out.println("Length: 384 Pages");
        System.out.println("Price: Rs.270");
        System.out.println("Ratings: 4.1 out of 5");
        System.out.println("Author: Andy Weir");
        System.out.println("Reference Number: 3");
        System.out.println("");
        System.out.println("");
        Ringworld();
    }
    
    public void Ringworld()
    {
        price4=495.03;
        System.out.println("Fourth: ");
        System.out.println("Ringworld");
        System.out.println("Length: 352 Pages");
        System.out.println("Price: Rs.495.03");
        System.out.println("Ratings: 4.3 out of 5");
        System.out.println("Author: Larry Niven");
        System.out.println("Reference Number: 4");
        System.out.println("");
        System.out.println("");
        Dispossessed();
    }
    
    public void Dispossessed()
    {
        price5=579;
        System.out.println("Fifth: ");
        System.out.println("The Dispossed");
        System.out.println("Length: 400 Pages");
        System.out.println("Price: Rs.579");
        System.out.println("Ratings: 4.2 out of 5");
        System.out.println("Reference Number: 5");
        System.out.println("Author: Ursula K. Le Guin");
        System.out.println(""); 
        System.out.println("");
        Input();
    }
    
    public void Input()
    {
        Billing sf = new Billing();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice according to the above books' reference numbers: ");
        System.out.println("~~OR~~");
        System.out.println("Enter 0 if you do not wish to buy anything from this section");
        int choice = sc.nextInt();
        if(choice>0&&choice<=5)
        {
            
        System.out.println("Enter the quantity: ");
        int q = sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                sf.S_F((price1*q));
                break;
            }
            
            case 2:
            {
                sf.S_F((price2*q));
                break;
            }
            
            case 3:
            {
                sf.S_F((price3*q));
                break;
            }
            
            case 4:
            {
                sf.S_F((price4*q));
                break;
            }
            
            case 5:
            {
                sf.S_F((price5*q));
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
        S_F();
        
    }
} //end of Input
} //end of class

