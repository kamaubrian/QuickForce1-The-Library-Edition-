package Model;
import java.sql.SQLException;
import java.util.*;
/**
 * Created by root on 9/16/17.
 */
public class adminModel extends mainModel{


    public String getUsername(String username){
        String sql="";
        String user="";
        dbConnect();
        try{
            sql="SELECT * FROM Credentials WHERE Username = ?";
            pst=conn.prepareStatement(sql);
            pst.setString(1,username);
            rst=pst.executeQuery();
            if(rst.next()){
                user=rst.getString("Username");
            }

        }catch(Exception ex){
            System.out.println("Getting Username Exception"+ex.getMessage());
        }
        dbDisconnect();
        return user;
    }
    public String getPassword(String password){
        String sql="";
        String pass="";
        dbConnect();
        try{
            sql="SELECT * FROM Credentials WHERE Password=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1,password);
            rst=pst.executeQuery();
            if(rst.next()){
                pass=rst.getString("Password");
            }
        }catch (Exception ex){
            System.out.println("Getting Password Exception"+ex.getMessage());
        }
        dbDisconnect();
        return pass;

    }
    public boolean addUser(String username, String password){
        boolean success = true;
        String sql="";
        dbConnect();
        try{
            sql="INSERT INTO Credentials(Username,Password) VALUES(?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,username);
            pst.setString(2,password);
            pst.executeUpdate();
            success=true;

        }catch (Exception ex){
            System.out.println("Adding User Exception"+ex.getMessage());
        }

        dbDisconnect();
        return success;
    }
    public ArrayList<String> getUsers(){
        ArrayList users = new ArrayList();
        dbConnect();
        String sql;
        try{
            sql="Select from Credentials";
            stat=conn.createStatement();
            rst=stat.executeQuery(sql);
            while(rst.next()){

                users.add(rst.getString("Username"));
            }
        }catch (Exception ex){
            System.out.println("Getting Users Exception"+ex.getMessage());
        }
        return users;
    }
    public boolean checkUserExists(){
        if(!getUsers().isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
