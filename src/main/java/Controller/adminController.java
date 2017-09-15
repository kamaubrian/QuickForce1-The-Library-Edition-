package Controller;
import java.util.Scanner;
/**
 * Created by root on 9/16/17.
 */
public class adminController implements admininterface {
    static Scanner scan = new Scanner(System.in);
    static String username;
    static String password;

    public static void main(String [] args){

        System.out.println("\t\tLibrary Management System");
        System.out.println("Enter Login Details\n");
        System.out.println("Enter Username");
        username=scan.next();
        System.out.println("Enter Password");
        password=scan.next();


    }


    @Override
    public boolean login(String username, String password){






        return false;
    }


}
