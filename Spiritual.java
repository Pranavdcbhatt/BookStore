package ProjectBookStore;
import java.util.Scanner;
public class Spiritual
{
    static double price1, price2, price3, price4, price5;
    public static void Spiritual()
    {
        Spiritual a = new Spiritual();
        System.out.println("We have the following Spiritual books: ");
        a.Monk();
    }
    
    public void Monk()
    {
        price1 = 256;
        System.out.println("First: ");
        System.out.println("The Monk Who Sold His Ferrari");
        System.out.println("Length: 785 Pages");
        System.out.println("Price: Rs.256");
        System.out.println("Robin Sharma");
        System.out.println("");
        System.out.println("");
        LAS();
    }
    
    public void LAS()
    {
        price2 = 120;
        System.out.println("Second: ");
        System.out.println("Life's Amazing Secrets: Jeevan Ke Adbhut Rahasya");
        System.out.println("Length: 208 Pages");
        System.out.println("Price: Rs.120");
        System.out.println("Author: Gaur Gopal Das");
        System.out.println("");
        System.out.println("");
        BG();
    }
    
    public void BG()
    {
        price3 = 499;
        System.out.println("Third: ");
        System.out.println("Bhagavad Gita: Yatharoop ");
        System.out.println("Length: 644 Pages");
        System.out.println("Language: Hindi");
        System.out.println("Price: Rs.499");
        System.out.println("A.C. Bhaktivendanta Swami Prabhupada");
        System.out.println("");
        System.out.println("");
        THB();
    }
    
    public void THB()
    {
        price4 = 299;
        System.out.println("Fourth: ");
        System.out.println("The Holy Bible");
        System.out.println("Length: 1360 Pages");
        System.out.println("Price: Rs.299");
        System.out.println("King James");
        System.out.println("");
        System.out.println("");
        WWN();
    }
    
    public void WWN()
    {
        price5 = 545;
        System.out.println("Fifth: ");
        System.out.println("Walking With Nanak");
        System.out.println("Length: 672 Pages");
        System.out.println("Price: Rs.545");
        System.out.println("Author: Haroon Khalid");
        System.out.println("");
        System.out.println("");
        Input();
    }
    
    public void Input()
    {
        Billing s = new Billing();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice according to the above books' reference numbers: ");
        System.out.println("~~OR~~");
        System.out.println("Enter 0 if you wish to go back to the Main Menu");
        int choice = sc.nextInt();
        if(choice>0&&choice<=5)
        {
            
        System.out.println("Enter the quantity: ");
        int q = sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                s.Spiritual((price1*q));
                break;
            }
            
            case 2:
            {
                s.Spiritual((price2*q));
                break;
            }
            
            case 3:
            {
                s.Spiritual((price3*q));
                break;
            }
            
            case 4:
            {
                s.Spiritual((price4*q));
                break;
            }
            
            case 5:
            {
                s.Spiritual((price5*q));
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
        Spiritual();
        
    }
        
    } //end of Input
    
} //end of class
