package Model;
import java.sql.*;
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


}
