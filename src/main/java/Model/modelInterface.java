package Model;

/**
 * Created by root on 9/16/17.
 */
public interface modelInterface {

     boolean dbConnect();
     boolean dbDisconnect();
     public String getUsername();
     public String getPassword();

}
