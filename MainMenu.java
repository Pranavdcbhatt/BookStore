package ProjectBookStore;
import java.util.Scanner;
public class MainMenu
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        System.out.println("Welcome to 'The Author Attic' Book Store!");
        System.out.println("Enter 1 to have a look at the Academic Books Section");
        System.out.println("Enter 2 to have a look at the Auto-Biographies Section");
        System.out.println("Enter 3 to have a look at the Science-fiction Section");
        System.out.println("Enter 4 to have a look at the Horror Section");
        System.out.println("Enter 5 to have a look at the Spiritual Section");
        System.out.println("Enter 6 to have a look at the Action and Adventure Section");
        System.out.println("Enter 0 to Exit");
        System.out.println("If you enter incorrectly, this Menu will reappear");
        int choice = sc.nextInt();
        if(choice==1)
        {
            Academic a = new Academic();
            a.Academic();
        }
        
        else if(choice==2)
        {
            AutoB b = new AutoB();
            b.AutoB();
        }
        
        else if(choice==3)
        {
            S_F c = new S_F();
            c.S_F();
        }
        
        else if(choice==4)
        {
            Horror d = new Horror();
            d.Horror();
        }
        
        else if(choice==5)
        {
            Spiritual e = new Spiritual();
            e.Spiritual();
        }
        
        else if(choice==6)
        {
            A_A f = new A_A();
            f.A_A();
        }
        else if(choice==0)
        {
            System.out.print("\f");
            System.out.println("Thank you for coming to our Store!");
            System.exit(0);
        }
        else
        {
            main();
        }
    } //end of main
} //end of class
