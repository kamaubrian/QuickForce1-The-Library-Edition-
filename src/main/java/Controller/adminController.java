package Controller;
import java.io.IOException;
import java.util.Scanner;
import Model.*;
import javax.security.auth.login.LoginException;
import java.io.Console;

/**
 * Created by root on 9/16/17.
 */
public class adminController implements admininterface {
    static Scanner scan = new Scanner(System.in);
    static adminModel adminmodel = new adminModel();
    static coursesController course = new coursesController();

    static Console console = System.console();
    static String username;
    static String password;

    public static void main(String [] args) throws IOException,LoginException{

        System.out.println("\t\tLibrary Management System");
        System.out.println("1.Login\n2.Sign Up");
        int input =scan.nextInt();
        switch(input){
            case 1:
                System.out.println("Enter Login Details\n");
                System.out.println("Enter Username");
                username=scan.next();
                System.out.println("Enter Password");
                password=scan.next();
                login(username,password);
                if(login(username,password)==true){
                    course.displaycourses();

                }else{
                    System.out.println("Incorrect Credentials");
                }
                break;

            case 2:
                System.out.println("Enter Your Preferred Username");
                username=scan.next();
                System.out.println("Enter Password");
                if(console!=null) {
                    password = console.readPassword().toString();
                }else{
                    System.out.println("Console could not be initiated");
                   password = scan.next();
                }
               // if(!adminmodel.checkUserExists()==true){ Checks for Users with the same Username
                adminmodel.addUser(username,password);
                if(adminmodel.addUser(username,password)==true){
                    System.out.println("User "+username.toUpperCase()+" Added Successfully");
                    course.displaycourses();
                }else{
                    System.out.println("Internal Error Occured, Please Try again Later");
                    return;
                }
                break;

                default:
                    System.out.println("Invalid Choice, Please Try Again");
                    break;


        }

    }

    @org.jetbrains.annotations.Contract(pure = true)
    public static boolean login(String username, String password) throws IOException{
        boolean sucess = true;
        if(adminmodel.getUsername(username).equals(username) && adminmodel.getPassword(password).equals(password)){
            System.out.println("Welcome to Our Library");
        }else{
            sucess=false;
        }
        return sucess;
    }


}
