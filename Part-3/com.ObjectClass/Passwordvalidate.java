import java.util.Scanner;

public class Passwordvalidate
{
    public static void main(String[] args) 
    {
        String usname = "manager";
        String password = "Admin";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user Name");
        String username = sc.next();
        System.out.println("Enter user Password");
        String pasword = sc.next();
        if(username.equalsIgnoreCase(usname) && pasword.equalsIgnoreCase(password))
        {
            System.out.println("Login Successfull");
        }
        else
        {
            System.out.println("Invalide Username/Password");
        }


        
    }
}