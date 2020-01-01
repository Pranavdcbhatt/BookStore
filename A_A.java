package ProjectBookStore;
import java.util.Scanner;
public class A_A
{
    double price1, price2, price3, price4, price5;
    public static void A_A()
    {
        A_A a = new A_A();
        System.out.println("We have the following Action and Adventure books: ");
        a.HP();
    }
    
    public void HP()
    {
        price1 = 2763;
        System.out.println("First: ");
        System.out.println("Harry Potter 7 Volume Children'S Paperback Boxed Set: The Complete Collection (Set of 7 Volumes) ");
        System.out.println("Length: 3872 Pages");
        System.out.println("Price: Rs.2763");
        System.out.println("J.K.Rowling");
        System.out.println("");
        System.out.println("");
        Journey();
    }
    
    public void Journey()
    {
        price2 = 129;
        System.out.println("Second: ");
        System.out.println("Journey To The Centre Of the Earth");
        System.out.println("Length: 240 Pages");
        System.out.println("Price: Rs.129");
        System.out.println("Author: Jules Verne");
        System.out.println("");
        System.out.println("");
        Life();
    }
    
    public void Life()
    {
        price3 = 214;
        System.out.println("Third: ");
        System.out.println("Life Of Pie ");
        System.out.println("Length: 352 Pages");
        System.out.println("Language: Engish");
        System.out.println("Price: Rs.214");
        System.out.println("Author: Yann Martel");
        System.out.println("");
        System.out.println("");
        Percy();
    }
    
    public void Percy()
    {
        price4 = 1193;
        System.out.println("Fourth: ");
        System.out.println("PercyJackson And The Lightning Thief");
        System.out.println("Length: 384 Pages");
        System.out.println("Price: Rs.1193");
        System.out.println("Kindle Edition Price: Rs.174.06");
        System.out.println("Rick Riordan");
        System.out.println("");
        System.out.println("");
        MazeRunner();
    }
    
    public void MazeRunner()
    {
        price5 = 284;
        System.out.println("Fifth: ");
        System.out.println("The Maze Runner");
        System.out.println("Length: 384 Pages");
        System.out.println("Price: Rs.284");
        System.out.println("Author: James Dashner");
        System.out.println("");
        System.out.println("");
        Input();
        
    }
    
    
    public void Input()
    {
        Billing aa = new Billing();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice according to the above books' reference numbers: ");
        System.out.println("~~OR~~");
        System.out.println("Enter 0 if you wish to go to the Main Menu");
        int choice = sc.nextInt();
        if(choice>0&&choice<=5)
        {
            
        System.out.println("Enter the quantity: ");
        int q = sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                aa.A_A((price1*q));
                break;
            }
            
            case 2:
            {
                aa.A_A((price2*q));
                break;
            }
            
            case 3:
            {
                aa.A_A((price3*q));
                break;
            }
            
            case 4:
            {
                aa.A_A((price4*q));
                break;
            }
            
            case 5:
            {
                aa.A_A((price5*q));
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
        A_A();
        
    }
        
    } //end of Input
} //end of class
