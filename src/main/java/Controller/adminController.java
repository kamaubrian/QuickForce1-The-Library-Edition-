package Controller;
import java.io.IOException;
import java.util.Scanner;
import Model.*;

import javax.security.auth.login.LoginException;

/**
 * Created by root on 9/16/17.
 */
public class adminController implements admininterface {
    static Scanner scan = new Scanner(System.in);
    static adminModel adminmodel = new adminModel();
    static coursesController course = new coursesController();
    static String username;
    static String password;

    public static void main(String [] args) throws IOException,LoginException{

        System.out.println("\t\tLibrary Management System");
        System.out.println("Enter Login Details\n");
        System.out.println("Enter Username");
        username=scan.next();
        System.out.println("Enter Password");
        password=scan.next();
        login(username,password);
        if(login(username,password)==true){
            course.displaycourses();

        }


    }

    @org.jetbrains.annotations.Contract(pure = true)
    public static boolean login(String username, String password) throws IOException{
        boolean sucess = true;
        if(adminmodel.getUsername(username).equals(username) && adminmodel.getPassword(password).equals(password)){
            System.out.println("Welcome to Our Library");
        }else{
            System.out.println("Incorrect Credentials");
            sucess=false;
        }
        return sucess;
    }


}
