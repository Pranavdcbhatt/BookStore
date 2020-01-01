package ProjectBookStore;
import java.util.Scanner;
public class Academic
{
    static double aprice = 0;
    static Scanner sc = new Scanner(System.in);
    public static void Academic()
    {
        Academic a = new Academic();
        Scanner sc = new Scanner(System.in);
        System.out.println("\f");
        System.out.println("We sell only I.C.S.E. books from grade 1 to 10");
        System.out.println("Enter your Standard");
        System.out.println("OR");
        System.out.println("Enter 0 to Go to the Main Menu.");
        int std = sc.nextInt();
        a.Processing(std);
    }
    
    public void Processing(int std)
    {
        Billing f = new Billing();
        switch(std)
            {
                case 1:
                {
                    System.out.println("The price for the full set of grade 1 books is Rs. 1500");
                    aprice = 1500;
                    f.Academic(aprice);
                    break;
                }
                
                case 2:
                {
                    System.out.println("The price for the full set of grade 2 books is Rs. 1550");
                    aprice = 1550;
                    f.Academic(aprice);
                    break;
                }
                
                case 3:
                {
                    System.out.println("The price for the full set of grade 1 books is Rs. 1700");
                    aprice = 1700;
                    f.Academic(aprice);
                    break;
                }
                
                case 4:
                {
                    System.out.println("The price for the full set of grade 1 books is Rs. 1800");
                    aprice = 1800;
                    f.Academic(aprice);
                    break;
                }
                
                case 5:
                {
                    System.out.println("The price for the full set of grade 1 books is Rs. 1900");
                    aprice = 1900;
                    f.Academic(aprice);
                    break;
                }
                
                case 6:
                {
                    System.out.println("The price for the full set of grade 1 books is Rs. 2100");
                    aprice = 2100;
                    f.Academic(aprice);
                    break;
                }
                
                case 7:
                {
                    System.out.println("The price for the full set of grade 1 books is Rs. 2150");
                    aprice = 2150;
                    f.Academic(aprice);
                    break;
                }
                
                case 8:
                {
                    System.out.println("The price for the full set of grade 1 books is Rs. 2400");
                    aprice = 2400;
                    f.Academic(aprice);
                    break;
                }
                
                case(9):
                {
                    System.out.println("For Commerce and Maths, Enter 1");
                    System.out.println("For Commerce and Economics, Enter 2");
                    System.out.println("For Science, Enter 3");
                    System.out.println("Enter here: ");
                    int course = sc.nextInt();
                    if(course==1)
                        {
                            System.out.println("The price for the entire set = Rs.2000");
                            aprice = 2000;
                            f.Academic(aprice);
                            break;
                        }
                        
                    else if(course==2)
                        {
                            System.out.println("The price for the entire set = Rs.1900");
                            aprice = 1900;
                            f.Academic(aprice);
                            break;
                        }
                        
                        else if(course==3)
                        {
                            System.out.println("The price for the entire set = Rs.2800");
                            aprice = 2800;
                            f.Academic(aprice);
                            break;
                        }
                        
                        else
                        {
                            System.out.println("\f");
                            System.out.println("The entry does not match our references ");
                            System.out.println("Please enter your details again.");
                            Academic();
                            break;
                        }
                    }
                
                case 10:
                {
                        System.out.println("For Commerce and Maths, Enter 1");
                        System.out.println("For Commerce and Economics, Enter 2");
                        System.out.println("For Science, Enter 3");
                        System.out.println("Enter here: ");
                        int course2 = sc.nextInt();
                        if(course2==1)
                        {
                            System.out.println("The price for the entire set = Rs.2000");
                            aprice = 2000;
                            f.Academic(aprice);
                            break;
                        }
                        else if(course2==2)
                        {
                            System.out.println("The price for the entire set = Rs.1900");
                            aprice = 1900;
                            f.Academic(aprice);
                            break;
                        }
                        
                        
                        else if(course2==3)
                        {
                            System.out.println("The price for the entire set = Rs.2800");
                            aprice = 2800;
                            f.Academic(aprice);
                            break;
                        }
                        else
                        {
                            System.out.println("The entry does not match our references ");
                            System.out.println("Please enter your details again.");
                            Academic();
                        }
                    }
                
                
                case 0:
                {
                    MainMenu a = new MainMenu();
                    a.main();
                }
                
                default:
                {
                    System.out.println("The entry does not match our references ");
                    System.out.println("Please enter your details again.");
                    Academic();
                }
            }
        } //end of Processing
    } //end of class
