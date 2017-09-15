package Model;

/**
 * Created by root on 9/16/17.
 */
public class adminModel extends mainModel implements modelInterface {
    @Override
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

    @Override
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





}
