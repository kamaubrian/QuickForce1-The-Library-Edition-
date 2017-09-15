package Model;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * Created by Brian Kamau on 9/16/17.;
 */
public abstract class mainModel implements modelinterface{
    public static String dbUrl ="jdbc:mysql://localhost:3306/Library?useSSL=false";
    public static String dbUsername = "root";
    public static String dbPassword="root";
    public static String dbDriver ="com.mysql.jdbc.Driver";
    protected PreparedStatement pst = null;
    protected  Statement stat = null;
    protected Connection conn =null;
    protected ResultSet rst=null;


    @Override
    public final boolean dbConnect(){

        boolean success=true;
        try{
            Class.forName(dbDriver);
            conn=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
            System.out.println("Successful Connection to Database");
            success=true;

        }catch(Exception ex){

            System.err.println("Database Connection Error"+ex.getMessage());
            success = false;
        }

        return success;
    }
    @Override
    public final boolean dbDisconnect(){
        boolean success = true;
        try{
            if(rst!=null){
                rst.close();
            }
            if(conn!=null){
                conn.close();

            }if(pst!=null){
                pst.close();
            }

        }catch(Exception ex){
            System.out.println("Closing Database Exception"+ex.getMessage());
        }


        return success;
    }

}
