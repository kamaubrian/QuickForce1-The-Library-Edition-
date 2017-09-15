package Model;

/**
 * Created by root on 9/16/17.
 */
public interface modelInterface {

     boolean dbConnect();
     boolean dbDisconnect();
      String getUsername(String username);
      String getPassword(String password);

}
